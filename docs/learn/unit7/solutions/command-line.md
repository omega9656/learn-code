---
layout: default
title: "Unit 7 Practice: Command Line Solution"
permalink: learn/unit7/practice/command-line-solution
nav_exclude: true
search_exclude: true
---

# Unit 7 Practice: Command Line Solution

1. Change directories into the `learn-code-unit-7` repo you downloaded/cloned.
   From now on, we will refer to this as the root directory, or simply root.
```bash
$ cd path/to/repo/learn-code-unit-7
```
2. Remove the Readme file.
```bash
$ rm README.md
```
3. Create a file called `hello.txt`.
```bash
$ touch hello.txt
```
4. Add the following line to `hello.txt` (without quotes): "world"
```bash
$ echo "world" > hello.txt
```
5. Print the contents of `hello.txt`.
```bash
$ cat hello.txt
world
```
6. Change directories into `src/com/omegarobotics`.
```bash
$ cd src/com/omegarobotics
# alternative solution
$ cd src
$ cd com
$ cd omegarobotics
```
7. List all of the files in this directory.
```bash
$ ls
books.txt   opmode.txt  songs.txt   tvshows.txt
```
8. Go back up one directory.
```bash
$ cd ..
```
9. Print the directory you're in.
```bash
$ pwd
/Users/yourname/path/to/repo/learn-code-unit-7/src/com
```
10. Create a new directory called `practice`.
```bash
$ mkdir practice
```
11. Change into the `practice` directory.
```bash
$ cd practice
```
12. Create a file called `name.txt`.
```bash
$ touch name.txt
```
13. Add the following line to `name.txt` (without quotes): "Jane Doe"
```bash
$ echo "Jane Doe" > name.txt
```
14. Go back up one directory.
```bash
$ cd ..
```
15. Print the directory you're in.
```bash
$ pwd
/Users/yourname/path/to/repo/learn-code-unit-7/src
```
16. Remove the `com` directory.
```bash
$ rm -r com
```

**Note**: You should not use `rmdir` because it won't work.
Remember that `rmdir` is only to remove empty directories,
while `rm -r` is for nonempty directories.
