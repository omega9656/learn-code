---
layout: default
title: Git
permalink: learn/unit7/git
parent: Unit 7
grand_parent: Learn
has_children: true
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

# Git
# Setup
# Configuring Git
# Getting Started




## Note on examples

Example output is _example output_, so what you see on your terminal may differ from what is displayed here.

## Git

[Git](https://git-scm.com/) is a distributed version control system (VCS).
Basically Git is Google Docs for code - it manages the different versions of your files. More specifically, it allows you to keep track of changes, go back to older edits, and collaborate with other coders.

**Note**: Git is _not_ the same thing as GitHub, as we will soon learn.

### Setup Git

1. [Download Git](https://git-scm.com/downloads) for your operating system and follow the instructions from the installation wizard
2. After installing, enter `git --version` into the terminal to verify that Git is ready to use. It should print the Git version you just installed on your computer.

## Terms You Should Know

| Term | Definition |
| :--- | :--- |
| repository (repo) | Place where your project's code is stored and tracked by Git |
| local | The version of a repository on your computer |
| remote | The version of a respository on the internet |
| `master` | Default branch that is created; is the "main" branch |
| `README.md` | A markdown (`.md`) file that talks about your repo (optional, but highly recommended) |

## Git Conceptually

TODO add this

### Branching

#### Merging

##### Merge Conflicts

## GitHub

While Git is a version control system you use on your local device, [GitHub](https://github.com) is a website that allows you to host remote repositories. It also has cool features which makes collaboration and sharing code easier on the Internet.

### Join GitHub

Create an account [here](https://github.com/join).

### Contributing

TODO Forking
TODO Pull Request (PR)

## Git Commands

All Git commands begin with `git`.

### Configuring Git

#### git config

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

You may also find it useful to turn on automatic colorization of Git command line output by using the command:

```bash
$ git config --global color.ui auto
```

To list all current config settings, you can use the command:

```bash
$ git config --list
```

### Getting Started

#### git init

Use `git init` to initialize a Git repo in the current directory.

```bash
$ git init
Initialized empty Git repository in /Users/janedoe/Desktop/project-directory/.git/
```

#### git status

Use `git status` to show the current status of a Git repo. It usually displays staged files, unstaged files, number of commits ahead/behind, and more.

```bash
$ git status
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)
```

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

### Logging

#### git log

`git log` displays commit history, which includes the author of the commit, the full commit message, timestamp, and commit hash (the seemingly random sequence of letters and numbers that is a unique identifier for each commit).

If the log is long, you may need to use the down arrow key to move down the log. Press Esc to end browsing the log.

For example:

```bash
$ git log
commit ed19c251cd5182577a9ff8918db792853cca1f43 (HEAD -> units, origin/units)
Author: Jane Doe <janedoe@example.com>
Date:   Tue Aug 4 23:17:29 2020 -0700

    Add Command Line page

commit ca9d3c8e93db8f6880507ce1c5d3b1ee9d1448d0
Author: Jane Doe <janedoe@example.com>
Date:   Tue Aug 4 21:27:18 2020 -0700

    Add Exception Handling page, add/edit lesson code

commit 2f49c4ddc5ab6c11137733c2cdf314105689b935
Author: Jane Doe <janedoe@example.com>
Date:   Mon Aug 3 23:13:39 2020 -0700

    Update changelog for v0.7.0
```

Use the `--oneline` flag to display a condensed log where each commit only takes up one line. This also shows the shorter version of the commit hash, which is really all you need.

```bash
$ git log --oneline
ed19c25 (HEAD -> units, origin/units) Add Command Line page
ca9d3c8 Add Exception Handling page, add/edit lesson code
2f49c4d Update changelog for v0.7.0
```

Use the `--graph` flag to display the log as a visual timeline.

```bash
$ git log --graph
* commit ed19c251cd5182577a9ff8918db792853cca1f43 (HEAD -> units, origin/units)
| Author: Jane Doe <janedoe@example.com>
| Date:   Tue Aug 4 23:17:29 2020 -0700
| 
|     Add Command Line page
| 
* commit ca9d3c8e93db8f6880507ce1c5d3b1ee9d1448d0
| Author: Jane Doe <janedoe@example.com>
| Date:   Tue Aug 4 21:27:18 2020 -0700
| 
|     Add Exception Handling page, add/edit lesson code
| 
* commit 2f49c4ddc5ab6c11137733c2cdf314105689b935
| Author: Jane Doe <janedoe@example.com>
| Date:   Mon Aug 3 23:13:39 2020 -0700
| 
|     Update changelog for v0.7.0
```

#### git shortlog

`git shortlog` displays a shorter version of `git log`. Each commit is grouped by author and commit header.

```bash
$ git shortlog
AfraMahammad (2):
      Add basic unit 2 material
      Merge branch 'units' of https://github.com/omega9656/learn-code into units

Amaan Mahammad (1):
      Add unit 5 material

Dusty the Dog (4):
      Create GitHub pages for this repository
      Set theme jekyll-theme-cayman
      Delete index.html
      Delete _config.yml

Rebecca (28):
      Finish unit 1 lessons and practice
      Finish unit 1 lessons and practice
      Add day 1 of unit 3 (methods)
      Add topics to each program
```

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



### Working with Remotes

### Other Possibly Useful Stuff

## .gitignore

## Basic Git Workflow

## Further Reading

### Reference Material

- In-depth
    - [git-scm Documentation](https://git-scm.com/doc)
    - [Pro Git Book (free to download)](https://git-scm.com/book/en/v2)
- Bite-sized (or should we say, _byte_-sized)
    - [GitHub Cheat Sheet](https://github.github.com/training-kit/downloads/github-git-cheat-sheet.pdf)
    - [Atlassian Git Tutorial](https://www.atlassian.com/git/tutorials)
    - [Git Guides by GitHub](https://github.com/github/training-kit/tree/master/git-guides)

### Guides

- [Learn Git in 15 Minutes](https://www.youtube.com/watch?v=USjZcfj8yxE)
    - [Introduction to Git](https://www.notion.so/Introduction-to-Git-ac396a0697704709a12b6a0e545db049)
- [Learn GitHub in 20 Minutes](https://www.youtube.com/watch?v=nhNq2kIvi9s)
    - [Introduction to GitHub](https://www.notion.so/Introduction-to-GitHub-202af6f64bbd4299b15f238dcd09d2a7)
