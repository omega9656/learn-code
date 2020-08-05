---
layout: default
title: Fixing Mistakes/Time Traveling
permalink: learn/unit7/fixing-mistakes-time-traveling
parent: Unit 7
grand_parent: Learn
nav_order: 7
---

<!-- prettier-ignore-start -->

# Unit 7: Git - Fixing Mistakes/Time Traveling
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

### Fixing Mistakes/Time Traveling

#### git checkout

You can use `git checkout` to check out (view) a previous commit via the commit hash.

```bash
$ git checkout <commit hash>
```

For example:

```bash
$ git checkout ed19c25
```

To get back to the "present," use `git checkout master` (or whatever branch you're on).

**Discard Changes**

You can use the following to unmodify a modified file (discard changes):

```bash
$ git checkout -- <file>
```

For example, let's say I added a line to `hello.txt` and I've decided that I actually don't want to add that. I can do:

```bash
# cd into directory where hello.txt is located
$ git checkout -- hello.txt
```

#### git restore
