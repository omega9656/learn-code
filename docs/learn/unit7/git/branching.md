---
layout: default
title: Branching
permalink: learn/unit7/branching
parent: Unit 7
grand_parent: Learn
nav_order: 5
---

<!-- prettier-ignore-start -->

# Unit 7: Git - Branching
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

### Branching

#### git branch

The `git branch` command is what it sounds like - it deals with branches.

On its own, it will list all branches of the repository. The one that has an `*` next to it is the branch that you are currently on. For example, if I had 4 branches (`exercises`, `feature`, `master`, and `patch`), it would look like this:

```bash
$ git branch
  exercises
  feature
* master
  patch
```

**Creating Branches**

To create a branch, use:

```bash
$ git branch <name>
```

Where `<name>` is replaced by the name of your branch.

For example, the following creates a new branch called `feature`:

```bash
$ git branch feature
```

**Deleting Branches**

To delete a _merged_ branch, use `-d`:

```bash
$ git branch -d feature
Deleted branch feature (was 9159807).
```

To delete an _unmerged_ branch, use `-D`:

```bash
$ git branch -D exercises
Deleted branch exercises (was 9159807).
```

#### git switch

You can use the new `git switch` command to switch branches. (Before people would use `git checkout`.)

For example:

```bash
$ git branch
* master
  patch
$ git switch patch
Switched to branch 'patch'
```

**Create & Switch**

You can also create a new branch and then switch to it:

```bash
$ git switch -c <name>
```

Where `<name>` is replaced by the name of the new branch. For example:

```bash
$ git switch -c auto
Switched to a new branch 'auto'
```

**WARNING**: `git switch` is an [experimental](https://git-scm.com/docs/git-switch) command!

#### git checkout

You can use `git checkout` to check out (move to) a branch.

```bash
$ git checkout <branch>
```

For example:

```bash
$ git checkout master
Switched to branch 'master'
```

**Create & Checkout**

You can create a new branch _and_ check it out in one line:

```bash
$ git checkout -b <name>
```

Where `<name>` is replaced by the name of the branch to be created. For example:

```bash
$ git checkout -b teleop
Switched to a new branch 'teleop'
```

For more ways to use `git checkout`, see [Fixing Mistakes/Time Traveling](#fixing-mistakes-time-traveling).

#### git merge

To merge a branch _into_ the branch you are currently on, use `git merge`:

```bash
$ git merge <branch>
```

For example, if I was on the `master` branch and I wanted to merge `feature` into `master`, I would do the following:

```bash
# Check you're on the right branch
$ git branch
  feature
  * master
$ git merge feature
# output should tell you files that were changed
```

You may need to resolve [merge conflicts](#merge-conflicts) when merging branches.

See also: [`git fetch`](#git-fetch).