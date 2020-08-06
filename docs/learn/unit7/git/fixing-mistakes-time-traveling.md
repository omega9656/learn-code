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

## Fixing Mistakes/Time Traveling

Besides being able to track different versions of your projects,
the cool part about Git is that you can undo things that
you modify, stage, or commit. Read on to learn how to undo changes
and "time travel" using Git.

## git checkout

You can use `git checkout` to check out (view) a previous commit via the commit hash.

```bash
$ git checkout <commit hash>
```

For example:

```bash
$ git checkout ed19c25
```

To get back to the "present," use `git checkout master` (or whatever branch you're on).

### Discard Changes

You can use the following to unmodify a modified file (discard changes):

```bash
$ git checkout -- <file>
```

For example, let's say I added a line to `hello.txt` and I've decided that I actually don't want to add that. I can do:

```bash
# cd into directory where hello.txt is located
$ git checkout -- hello.txt
```

## git restore

You can use `git restore --staged` is the new way to unstage files.

```bash
$ git restore --staged
```

For the old way, see [`git reset`](#git-reset).

## git revert

Use `git revert` to "undo" a commit. Note that this does not
actually delete the comment you are reverting; rather, it
creates a new commit that effectively removes changes from
the reverted commit.

**Usage**

```bash
$ git revert <commit>
```

Where `<commit>` is replaced by the commit hash of the commit
you want to revert.

**Example**

In this example, I am reverting `85b4906`, which added a file
called `message.txt`. The commit message was `"Add message"`.

```bash
$ git revert 85b4906
Removing message.txt
[master 31eff03] Revert "Add message"
 1 file changed, 1 deletion(-)
 delete mode 100644 message.txt
```

When completing a revert, Git will open your default editor
so that you can write a revert commit message. For example: 

```bash
Revert "Add message"

This reverts commit 85b4906b28651cad5fa440e98036e76c8bba38e8.

# Please enter the commit message for your changes. Lines starting
# with '#' will be ignored, and an empty message aborts the commit.
#
# On branch master
# Changes to be committed:
#       deleted:    message.txt
#
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
"~/Desktop/project-directory/.git/COMMIT_EDITMSG" 11L, 296C
```

Note that you may need to resolve conflicts when using `git revert`.

## git reset

`git reset` is used to effectively "erase" history, resetting
the state of your repository to a certain point in time. Because of this,
make sure you are ***absolutely certain*** you do not need the commits
that occurred after the reset point.

```bash
$ git reset <commit>
```

Where `<commit>` is replaced by the commit hash. All commits AFTER
the given commit will be erased from the timeline. If you did this by
accident, you can re-commit any files files right after.

### Hard Reset

If you add the `--hard` flag, you ***will not*** be able to re-commit files.

```bash
$ git reset <commit> --hard
```

### Soft Reset

Use the following command to remove files from a `git commit`:

```bash
$ git reset --soft HEAD~[int]
```

Where `[int]` is replaced by an integer. For example, `HEAD~2`
represents 2 commits before `HEAD`.

This move files modified in that commit to the staging area.
At this point, you can [remove files](/learn-code/learn/unit7/other-useful-stuff#git-rm)
or unstage them (see below or [`git restore`](#git-restore)).

### Unstage Files

To unstage a file, use the following:

```bash
$ git reset HEAD <file>
```
