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

## Branching

So far we have only covered committing changes to the default branch, which
is `master`. But what if you want to modify the code without messing up
the original? You could make a copy of the directory and set up a totally
separate respository, but that seems unnecessary.

Instead of doing that, we can take advantage of a feature of Git called
_branching_ which allows us to create and work on different branches (versions)
of the same repository.

### Freely Experiment

As mentioned earlier, a big advantage of branches is that you can create
a branch without messing up the "main" code in `master`. This allows you
to freely experiment with new features or enhancements for your project
(or in this case probably OpModes).

### Branches Conceptually

It is probably easier to understand what a branch is with a diagram.
Let's say that the timeline below represents commit history on the master
branch, where `*` signifies a commit.

```

master * -------- * -------- * --------- *
                                        HEAD

```

Notice that the most recent commit is referred to as the `HEAD`.

When we use [`git branch`](#git-branch) to create a new branch,
we branch off from the `master` timeline to start a new one.
However, all previous history is preserved, so right now
the new branch created (let's call it `feature`) is _even_
with `master` (they're the same).

```

                                 feature   -------                       
                                          /
master * -------- * -------- * --------- *
                                        HEAD

```

We can use [`git checkout`](#git-checkout) or [`git switch`](#git-switch) to
switch between branches. As we add different commits to `master` and `feature`,
their commit histories begin to diverge. They also have different `HEAD` commits.

```

                                 feature   ------- * ------ * ------ * ---
                                          /                         HEAD
master * -------- * -------- * --------- * --- * -------------- * --------
                                                               HEAD

```

Eventually, if we think the new functionality from `feature` is worth
implementing in our "main" branch (`master`), we can _merge_ the changes
from each branch so that we can get the best of both worlds by incorporating
the changes from `feature` into `master`. When merging a branch into another,
a _merge commit_ is created.

```

                                 feature   ------- * ------ * ------ * ---
                                          /                         HEAD  \
master * -------- * -------- * --------- * --- * -------------- * -------- * ------ *
                                                                          merge    HEAD
                                                                          commit

```

After merging, you can continue developing on either branch, or you can delete
the feature branch safely (since its changes were incorporated into `master`).

### Merge Conflicts

When merging two branches, they may have conflicting changes which Git cannot
merge automatically This leads to a _merge conflict_ which must be resolved manually.

For example, let's say John was editing on the `master`
branch and his `message.txt` file looks like this:

```
Hello world
```

Let's suppose Jane then make a branch called `feature` after that and
edits `message.txt` so that it looks like this:

```
My name is Jane
```

While Jane committed those changes, let's suppose John then adds on to
the `message.txt` file so it looks like this:

```
Hello world
My name is John
```

If Jane now attempts to merge `feature` into `master`, it will result in a conflict.
The output of using `git merge` will look something like this:

```bash
$ git merge feature
Auto-merging message.txt
CONFLICT (content): Merge conflict in message.txt
Automatic merge failed; fix conflicts and then commit the result.
```

You will notice that the file(s) that contain conflicts will be edited
in a funky way by Git:

```bash
$ cat message.txt
<<<<<<< HEAD
Hello world
My name is John
=======
My name is Jane
>>>>>>> feature
```

No need to panic! Just read the file carefully. Code within
`<<<<<<< HEAD` and `=======` is from the current branch. Code within
`=======` and `>>>>>>> feature` (or whatever the branch name is) is
from the branch that you are trying to merge.

To resolve the merge conflict, get in touch with whoever
made the change that is conflicting. Work it out and reach an agreement
on what should the code look like. Then edit the file accordingly.

In order for Git to know the merge conflict is resolved, you must delete
all of the Git stuff. That is, you have to delete all of the `<<<<<<< HEAD`,
`=======`, and `>>>>>>> feature` stuff.

Once you're done, commit your changes to resolve and finish the merge.

## Git Commands

### git branch

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

### git switch

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

### git checkout

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

For more ways to use `git checkout`, see [Fixing Mistakes/Time Traveling](/learn-code/learn/unit7/fixing-mistakes-time-traveling).

### git merge

To merge a branch _into_ the branch you are currently on, use `git merge`:

```bash
$ git merge <branch>
```

For example, if I was on the `master` branch and I wanted to merge `feature`
into `master`, I would do the following:

```bash
# Check you're on the right branch
$ git branch
  feature
* master
$ git merge feature
Updating 9159807..2750f7c
Fast-forward
 message.txt | 2 ++
 1 file changed, 2 insertions(+)
 create mode 100644 message.txt
```

Notice that there are different methods that Git uses to merge branches.
You will often see `Fast-forward` and `recursive`.

The `git merge` output should also tell you the latest commit,
files changed, how many insertions (2 in the example above) and
the type of insertions (+ for additions, - for deletions).

`create mode` means that the file did not exist previously on
the branch you merged a branch into.

**Merge Commit Message**

Notice that when you use `git merge` you will need to write
a merge commit message. Git will open your default text editor
to do this (e.g. vim, nano, or emacs). For the most part, you
can just go with the default commit message.

This is what it might look like if you use vim:

```bash
Merge branch 'feature'
# Please enter a commit message to explain why this merge is necessary,
# especially if it merges an updated upstream into a topic branch.
#
# Lines starting with '#' will be ignored, and an empty message aborts
# the commit.
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
"~/Desktop/project-directory/.git/MERGE_MSG" 6L, 249C
```

To finish the merge on vim, you can use Shift + : and then
type `wq` (for write quit) and press Enter. It will look like this right before
you press Enter:

```bash
Merge branch 'feature'
# Please enter a commit message to explain why this merge is necessary,
# especially if it merges an updated upstream into a topic branch.
#
# Lines starting with '#' will be ignored, and an empty message aborts
# the commit.
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
:wq
```

**Note**: If you use vim and you want to edit the message,
press i (for Insert mode), edit whatever you want, and then press Esc.
_Then_ do Shift + : and type `wq` and press Enter.

**Merge Conflicts**

When merging a branch into another one, you may encounter a merge conflict.
You can learn about them [here](#merge-conflicts).

**Abort Merge**

You can use `git merge --abort` to abort a merge in progress.

See also: [`git fetch`](/learn-code/learn/unit7/working-with-remotes#git-fetch).
