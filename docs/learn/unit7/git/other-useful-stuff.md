---
layout: default
title: Other Useful Stuff
permalink: learn/unit7/other-useful-stuff
parent: Unit 7
grand_parent: Learn
nav_order: 10
---

<!-- prettier-ignore-start -->

# Unit 7: Git - Other Useful Stuff
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Other Useful Stuff

The following sections detail miscellaneous Git commands that you
may find useful at some point in your programming journey, but are not
immediately necessary for you to code in FTC.

At the bottom of each section is a link to the Atlassian tutorial
on how to use that command, which you may find useful since we are only
briefly touching on each command and its usage.

## git show

Use `git show` to display information about objects in Git, such
as a commit or a [tag](#git-tag).

```bash
# Usage
$ git show <object>

# Example
$ git show 3b8b88f
commit 3b8b88f191b54de2796c0dfcacf6fb6d3371b139
Author: Rebecca Dang <ph.rdang@gmail.com>
Date:   Thu Aug 6 15:19:48 2020 -0700

    Finish GitHub page, add github images

diff --git a/docs/images/github/branches-tags.png b/docs/images/github/branches-tags.png
new file mode 100644
index 0000000..97cc689
Binary files /dev/null and b/docs/images/github/branches-tags.png differ
diff --git a/docs/images/github/code.png b/docs/images/github/code.png
new file mode 100644
index 0000000..7d7a26e
:
```

You can use the down arrow to "scroll" if there's a lot of information and press
`q` to stop scrolling.

**Note**: By default, `git show` without any arguments is equivalent
to `git show HEAD`, which shows details about the last commit.

[Atlassian tutorial](https://www.atlassian.com/git/tutorials/git-show)

## git rebase

Instead of using `git merge`, some developers prefer to use `git rebase`.
The idea behind rebasing is that instead of merging changes from a branch
through a merge commit, you move* all of the commits from the branch
and put all of that history on top of `HEAD`. In other words, you're changing
the base of the branch to be the `HEAD` of the `master` branch (or whatever you're rebasing
to).

*Techically, new commits are created so the hashes are different.

```bash
# Usage
$ git rebase <base>
```

Where `<base>` is replaced by whatever you want the new base of the current
branch to be, whether it's a commit hash, branch, [tag](#git-tag), etc.

`git rebase` can also be used to "squash" multiple commits into a single commit.
For more information on how to do this, see [this article](https://medium.com/@slamflipstrom/a-beginners-guide-to-squashing-commits-with-git-rebase-8185cf6e62ec).

[Atlassian tutorial](https://www.atlassian.com/git/tutorials/rewriting-history/git-rebase)

## git diff

The `git diff` command is used to compare objects in Git (such as branches or commits)
at different points in time. By default, `git diff` shows the difference what you have
currently and `HEAD`.

```bash
# Usage
$ git diff <object>

# Example - default behavior
$ git diff
diff --git a/docs/learn/unit7/git/other-useful-stuff.md b/docs/learn/unit7/git/other-useful-stuff.md
index 1c7b742..09e0325 100644
--- a/docs/learn/unit7/git/other-useful-stuff.md
+++ b/docs/learn/unit7/git/other-useful-stuff.md
@@ -32,14 +32,69 @@ briefly touching on each command and its usage.
 
+Use `git show` to display information about objects in Git, such
+as a commit or a [tag](#git-tag).

# Example - diff between commits
$ git diff a55e625 3b8b88f
diff --git a/README.md b/README.md
index 61dff39..83acfd9 100644
--- a/README.md
+++ b/README.md
@@ -1,5 +1,5 @@
 # Learn Code
 
-Sustainability lessons to teach or learn Java, bash, Git, GitHub, and more for FTC.
+Sustainability lessons to teach or learn Java
 
 See our [website](https://github.com/omega9656/learn-code/) to learn/teach code!
```

[Atlassian tutorial](https://www.atlassian.com/git/tutorials/saving-changes/git-diff)

## git blame

The `git blame` command is used to show information about individual lines in a file
such as the commit hash, who modified the line, and when.

```bash
# Usage
$ git blame <file>

# Example
$ git blame index.md
06492da6 (Rebecca Dang 2020-07-17 16:43:39 -0700  1) ---
06492da6 (Rebecca Dang 2020-07-17 16:43:39 -0700  2) layout: default
06492da6 (Rebecca Dang 2020-07-17 16:43:39 -0700  3) title: Home
c110b282 (Rebecca Dang 2020-07-17 19:31:37 -0700  4) nav_order: 1
06492da6 (Rebecca Dang 2020-07-17 16:43:39 -0700  5) ---
```

[Atlassian tutorial](https://www.atlassian.com/git/tutorials/inspecting-a-repository/git-blame)

## git reflog

The `git reflog` command displays the Git reference log, which shows updates on branch tips.
This allows you to go back in history if needed, such as recovering lost commits.

```bash
# Usage
$ git reflog

# Example
$ git reflog
a55e625 (HEAD -> units, origin/units) HEAD@{0}: checkout: moving from master to units
cf07836 (origin/master, origin/HEAD, master) HEAD@{1}: pull: Fast-forward
33727bf HEAD@{2}: checkout: moving from units to master
a55e625 (HEAD -> units, origin/units) HEAD@{3}: pull origin master: Merge made by the 'recursive' strategy.
3b8b88f HEAD@{4}: commit: Finish GitHub page, add github images
65a6174 HEAD@{5}: commit: Add images, move further reading
```

[Atlassian tutorial](https://www.atlassian.com/git/tutorials/rewriting-history/git-reflog)

## git rm

The `git rm` command removes file(s) from the working directory and adds
that deletion to the staging area.

```bash
# Usage
$ git rm <file>

# Example
$ git rm test.txt
rm 'test.txt'
```

The reason why `git rm` is advantageous over the bash `rm` command is that
it removes the file _and_ stages that deletion. The `rm` command, on the other hand,
only removes the file.

### --cached

Use the `--cached` flag to remove the file from the index (this means it is no longer
tracked) but keep the file in the working directory (modifications are saved).
This is useful when you add a file to the [`.gitignore](/learn-code/learn/unit7/gitignore)
and you only want to remove it from the repository, not the working directory.

```bash
# Usage
$ git rm --cached <file>

# Example
$ git rm --cached test.txt
rm 'test.txt'
```

[Atlassian tutorial](https://www.atlassian.com/git/tutorials/undoing-changes/git-rm)

## git stash

We think Atlassian described `git stash` well:

> `git stash` temporarily shelves (or stashes) changes you've made
> to your working copy so you can work on something else, and then
> come back and re-apply them later on. Stashing is handy if you need
> to quickly switch context and work on something else, but you're mid-way
> through a code change and aren't quite ready to commit.

```bash
# Usage
$ git stash

# Example
$ git stash
Saved working directory and index state WIP on master: 56ad473 Initial commit
```

### Include Untracked Files

To stash untracked files, use the `-u` or `--include-untracked` flag.

```bash
# Usage 1
$ git stash -u

# Usage 2 (equivalent to Usage 1)
$ git stash --include-untracked
```

### Include Ignored Files

To stash files that are ignored due to the [`.gitignore`](/learn-code/learn/unit7/gitignore),
use the `-a` or `--all` flag.

```bash
# Usage 1
$ git stash -a

# Usage 2 (equivalent to Usage 1)
$ git stash --all
```

### Multiple Stashes

You can have multiple stashes at the same time. To list them, use `list`.

```bash
# Usage
$ git stash list

# Example
$ git stash list
stash@{0}: WIP on master: a9a0c93 Add world.txt
stash@{1}: WIP on master: 56ad473 Initial commit
```

As you might imagine, it's difficult to keep track of the different stashes
without some type of documentation to go with each stash. Luckily, you can
use the `save` argument to attach a message to the stash.

```bash
# Usage
$ git stash save <message>

# Example
$ git stash save "Add if statements section"
```

### Re-Applying Changes

When you're ready to re-apply changes saved in your stash, you can
use `pop` or `apply`.

`pop` will re-apply changes from a stash _and_ remove that stash.

```bash
# Usage
$ git stash pop <stash>

# Example
$ git stash pop stash@{1}
```

**Note**: By default, if you do not provide a stash, the most recent
one (notated as `stash@{0}` when you use `list`) will be popped.

`apply` will re-apply changes from the most recent stash (but will _not_ remove it).

```bash
$ git stash apply
```

### Branching

You might be thinking, what if I made edits in the past that conflict with
the current state of my repo? In that case, re-applying changes would result
in conflicts. To avoid this, you can re-apply changes in a new, separate branch
and then merge it later using `branch`.

```bash
# Usage
$ git stash <branch> <stash>

# Example
$ git stash feature stash@{3}
```

### Deleting Stashes

If you decide that you no longer need a stash, you can delete it using `drop`.

```bash
# Usage
$ git stash drop <stash>

# Example
$ git stash drop stash@{2}
```

If you want to delete _ALL_ stashes, you can use `clear`.

```bash
$ git stash clear
```

[Atlassian tutorial](https://www.atlassian.com/git/tutorials/saving-changes/git-stash)

## git tag

When installing software, you have probably noticed that there can be different
versions of an application. Usually, it's notated with numbers, like v5.2 or v0.5.2.
The `git tag` command allows you to do just that by _tagging_ certain commits.

```bash
# Usage
$ git tag <version>

# Example
$ git tag v5.2
```

### Annotated Tags

There is another type of tag called an _annotated tag_ which contains more data
about the person who created the tag and when. To make an annotated tag, use the `-a`
option.

```bash
# Usage
$ git tag -a <version>

# Example
$ git tag -a v5.2
```

You can also add a message to an annotated tag using the `-m` flag.
Use this to describe changes that this version implements.

```bash
# Usage
$ git tag -a <version> -m <message>

# Example
$ git tag -a v5.2 -m "Publish Unit 7"
```

### Listing Tags

To list all tags, use `git tag` by itself.

```bash
# Usage
$ git tag

# Example
$ git tag
v0.0
v1.0
v2.0
v3.0
v4.0
v5.0
v5.2
```

### Pushing Tags

When pushing normally, tags will not be included. You need to use the `--tags`
flag to push all tags to remote.

```bash
$ git push --tags
```

### Checking Out Tags

You can checkout a tag using `git checkout`.

```bash
# Usage
$ git checkout <tag>

# Example
$ git checkout v5.2
```

### Deleting Tags

You can delete a tag using the `-d` flag.

```bash
# Usage
$ git tag -d <tag>

# Example
$ git tag -d v5.2
```

[Atlassian tutorial](https://www.atlassian.com/git/tutorials/inspecting-a-repository/git-tag)

## Further Reading

In no way are our lessons entirely comprehensive of everything Git and GitHub can do.
If you want to learn more, we recommend the following reference materials
and guides.

### GitHub Features

-   [Forking](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/working-with-forks)
-   [Pull Requests](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/proposing-changes-to-your-work-with-pull-requests)
-   [Issues](https://docs.github.com/en/github/managing-your-work-on-github/managing-your-work-with-issues)

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
