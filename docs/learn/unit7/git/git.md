---
layout: default
title: Git
permalink: learn/unit7/git
parent: Unit 7
grand_parent: Learn
nav_order: 3
---

<!-- prettier-ignore-start -->

# Unit 7: Git
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Git

[Git](https://git-scm.com/) is a distributed version control system (VCS).
Basically Git is Google Docs for code - it manages the different versions of your files. More specifically, it allows you to keep track of changes, go back to older edits, and collaborate with other coders.

**Note**: Git is _not_ the same thing as GitHub, as we will soon learn.

### Install Git

1. [Download Git](https://git-scm.com/downloads) for your operating system and follow the instructions from the installation wizard
2. After installing, enter `git --version` into the terminal to verify that Git is ready to use. It should print the Git version you just installed on your computer.

## Terms You Should Know

| Term              | Definition                                                   |
| :---------------- | :----------------------------------------------------------- |
| repository (repo) | Place where your project's code is stored and tracked by Git |
| local             | The version of a repository on your computer                 |
| remote            | The version of a respository on the internet                 |
| `master`          | Default branch that is created; is the "main" branch         |
| `README.md`       | A markdown (`.md`) file that talks about your repo (optional, but highly recommended) |

## Git Commands

All Git commands begin with `git`.

**Note**: Example output is _example output_, so what you see on your terminal may differ from what is displayed here.

## Configuring Git

### git config

Use `git config` to configure your user settings. You should set the global username and email to your name and email by using the commands below.

Replace `<name>` with your name in quotes and `<email>` with your email in quotes.

```bash
$ git config --global user.name <name>
$ git config --global user.email <email>
```

**Example**

```bash
$ git config --global user.name "Jane Doe"
$ git config --global user.email "janedoe@example.com"
```

The user name and email that you set above will be associated with
all of the commits you make on your computer.

You may also find it useful to turn on automatic colorization of Git
command line output by using the command:

```bash
$ git config --global color.ui auto
```

To list all current config settings, you can use the command:

```bash
$ git config --list
```

## Getting Started

### git init

Use `git init` to initialize a Git repo in the current directory.

```bash
$ git init
Initialized empty Git repository in /Users/janedoe/Desktop/project-directory/.git/
```

On a conceptual level, what this does is it sets up tracking for all of
the subdirectories and files in the project directory. Any modification that is made,
whether it's adding 1000 lines of code, deleting a file, renaming a file,
or adding a single space to a line of code, will be tracked.

### git status

Use `git status` to show the current status of a Git repo. It usually displays
staged files, unstaged files, number of commits ahead/behind, and more.

```bash
$ git status
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)
```

Another helpful thing about `git status` is that it gives you
helpful hints about different Git commands you can use depending
on the current status of your repository. For example, this is
what a `git status` might look like while I am trying to resolve
a [merge conflict](/learn-code/learn/unit7/branching#merge-conflicts).

```bash
$ git status
On branch master
You have unmerged paths.
  (fix conflicts and run "git commit")
  (use "git merge --abort" to abort the merge)

Unmerged paths:
  (use "git add <file>..." to mark resolution)
	both modified:   message.txt

no changes added to commit (use "git add" and/or "git commit -a")
```

Using this output, I know that I can use `git merge --abort` if I
want to abort the merge.
