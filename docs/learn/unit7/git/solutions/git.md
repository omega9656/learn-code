---
layout: default
title: "Unit 7 Practice: Git Solution"
permalink: learn/unit7/practice/git-solution
nav_exclude: true
search_exclude: true
---

# Unit 7 Practice: Git Solution

**Note**: We had to add the `# empty line` comments so that
there were no empty lines in the code blocks so that the
Markdown formatting would work. In reality, there would just
be an empty line (not literally the text `# empty line`).

1. Change directories into the `learn-code-unit-7` repo you downloaded/cloned.
   From now on, we will refer to this as the root directory, or simply root.
```bash
$ cd path/to/repo/learn-code-unit-7
```
2. Create a new file called `quote.txt`.
```bash
$ touch quote.txt
```
3. Add the following to `quote.txt` (without quotes): "Smart people are stupid."
```bash
$ echo "Smart people are stupid." > quote.txt
```
4. Display the status of the repository.
```bash
$ git status
On branch master
Your branch is up to date with 'origin/master'.
# empty line
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        quote.txt
# empty line
nothing added to commit but untracked files present (use "git add" to track)
```
5. Add the `quote.txt` file to the staging area.
```bash
$ git add quote.txt
```
6. Commit the changes with the message "Add quote.txt".
```bash
$ git commit -m "Add quote.txt"
[master f8438b3] Add quote.txt
 1 file changed, 1 insertion(+)
 create mode 100644 quote.txt
```
7. Change directories into `src/com/omegarobotics`.
```bash
$ cd src/com/omegarobotics
# alternate solution
$ cd src
$ cd com
$ cd omegarobotics
```
8. Append your favorite song to `songs.txt`.
```bash
$ echo "Goodbye Yellow Brick Road by Sara Bareilles" >> songs.txt
```
9. Append your favorite book to `books.txt`.
```bash
$ echo "Illuminae by Amie Kaufman and Jay Kristoff" >> books.txt
```
10. Append your favorite TV show to `tvshows.txt`.
```bash
$ echo "Grey's Anatomy" >> tvshows.txt
```
11. Display the status of the repository.
```bash
$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)
# empty line
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   books.txt
        modified:   songs.txt
        modified:   tvshows.txt
# empty line
no changes added to commit (use "git add" and/or "git commit -a")
```
12. Add all of the modified files to the staging area.
```bash
$ git add .
```
13. Commit the changes with the message "Add my favorite song, book, and TV show".
```bash
$ git commit -m "Add my favorite song, book, and TV show"
[master 2127e9f] Add my favorite song, book, and TV show
 3 files changed, 3 insertions(+)
```
14. Display the log of commits.
```bash
# Note that your output should generally look like
# this, but it won't be exact
$ git log
commit 2127e9f31a21de4ca4d60f5fe081c93f2d7759b9 (HEAD -> master)
Author: Your Name <youremail@example.com>
Date:   Thu Aug 6 23:45:23 2020 -0700
# empty line
    Add my favorite song, book, and TV show
# empty line
commit f8438b3f26162d19a16bbf88c1b5dde4025f1066
Author: Your Name <youremail@example.com>
Date:   Thu Aug 6 23:41:28 2020 -0700
# empty line
    Add quote.txt
# Note that you should be able to view more previous commits
# which are omitted here for brevity
```
15. Create a new branch called `feature` and check it out.
```bash
$ git branch feature
$ git checkout feature
Switched to branch 'feature'
# alternate solution
$ git checkout -b feature
Switched to a new branch 'feature'
```
16. Add another song you like to `songs.txt` and commit that change with
    an appropriate commit message.
```bash
$ echo "Mercy by Shawn Mendes" >> songs.txt
$ git add songs.txt
$ git commit -m "Add Mercy to songs.txt"
[feature 243945f] Add Mercy to songs.txt
 1 file changed, 1 insertion(+)
```
17. Check out the `master` branch.
```bash
$ git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)
```
18. Remove `songs.txt` and commit that change.
```bash
$ git rm songs.txt
rm 'src/com/omegarobotics/songs.txt'
$ git commit -m "Delete songs.txt"
[master 34b977d] Delete songs.txt
 1 file changed, 8 deletions(-)
 delete mode 100644 src/com/omegarobotics/songs.txt
# alternate solution
$ rm songs.txt
$ git add songs.txt
$ git commit -m "Delete songs.txt"
[master 34b977d] Delete songs.txt
 1 file changed, 8 deletions(-)
 delete mode 100644 src/com/omegarobotics/songs.txt
```
19. Merge `feature` into `master`. Resolve the conflict by completing
    the deletion of `songs.txt`.
```bash
$ git merge feature
CONFLICT (modify/delete): src/com/omegarobotics/songs.txt deleted in HEAD and modified in feature. Version feature of src/com/omegarobotics/songs.txt left in tree.
Automatic merge failed; fix conflicts and then commit the result.
$ git add songs.txt
$ git commit
# at this point your default editor will open and you can
# edit the merge commit message (or don't)
[master 33c29c3] Merge branch 'feature'
```
20. Delete the `feature` branch.
```bash
$ git branch -d feature
Deleted branch feature (was 243945f).
```
