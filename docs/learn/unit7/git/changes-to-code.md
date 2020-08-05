---
layout: default
title: Changes to Code
permalink: learn/unit7/changes-to-code
parent: Unit 7
grand_parent: Learn
nav_order: 4
---

<!-- prettier-ignore-start -->

# Unit 7: Git - Changes to Code
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

### Changes to Code

#### git add

Use `git add` to add file(s) to the staging area. You must add a file to the staging area before committing it.

```bash
$ git add <path>
```

Note that you can add multiple files at the same time.

```bash
$ git add hello.txt world.txt
```

You can also use [globs](https://www.atlassian.com/git/tutorials/saving-changes/gitignore#git-ignore-patterns) to add files that match a certain pattern. You can also add a directory, which will add all unstaged modified files in that directory.

To add all files in a directory, use:

```bash
$ git add .
```

#### git commit

Use `git commit` to commit files added to the staging area. You should always have a commit message attached to a commit. Be sure to follow good [commit message conventions](https://chris.beams.io/posts/git-commit/).

```bash
$ git commit -m <message>
```

For example:

```bash
# Start in the root directory of the repo
$ touch hello.txt
$ git add hello.txt
$ git commit -m "Initial commit"
[master (root-commit) 9159807] Initial commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 hello.txt
```

**Amend a commit**

If you accidentally commit prematurely or want to edit the commit message _BEFORE pushing to remote_, you can use the following command:

```bash
$ git commit --amend
```

Make sure that _BEFORE_ you execute the command above, you have added any files you want to the staging area so that they are included in the amended commit.

Also note that once the command executes, your default text editor (such as vim, vi, nano, or emacs) will open so that you can edit the commit message.

**Multi-line commit messages**

There will come a time when you don't have enough space to write everything you want to write in the header of the commit message. Thus, you'll need a multi-line commit message.

You should be able to just press Enter after writing the commit message header in order to move to new lines. However, in the event that this does not work for you, you can use the `-m` flag multiple times. The separate messages will be treated as separate paragraphs.

```bash
$ git commit -m <paragraph1> -m <paragraph2> ...
```

For example:

```bash
$ git commit -m "First line" -m "Second line"
```

**Adding & Committing**

You can skip using `git add` with the `-a` flag. This will stage all modified files that were previously tracked (files that aren't new) and then commits them. (Thus, if you want to commit untracked files, you will need to use `git add`.)

```bash
$ git commit -am <message>
```

For example:

```bash
$ git commit -am "I am adding and committing at the same time"
```