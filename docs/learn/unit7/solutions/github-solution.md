---
layout: default
title: "Unit 7 Practice: GitHub Solution"
permalink: learn/unit7/practice/github-solution
nav_exclude: true
search_exclude: true
---

# Unit 7 Practice: GitHub Solution

**Note**: If the instructions can be completed via the terminal, we will list it here.
Otherwise, assume the solution has to do with the browser, text editor, or IDE.

Go to the [Learn Code Unit 7](https://github.com/omega9656/learn-code-unit-7) repository on GitHub.

1. Fork the repository to your account. **For solution, see [forking](/learn-code/learn/unit7/github#forking).**
2. Clone your forked repository to local. (Use the terminal.)
```bash
$ git clone https://github.com/your_username/learn-code-unit-7)
# where your_username is replaced with your GitHub username
```

Open an IDE or text editor application and do the following
(from now on you can choose to complete the instructions using
the application's GUI or using the command line):

1. Make a new directory called `practice` in the root directory  and change into it.
```bash
# Make sure you are in the root directory
$ mkdir practice
$ cd practice
```
2. Create a new file called `hello.txt` and add the following: "Hello world, I'm a programmer".
```bash
$ touch hello.txt
$ echo "Hello world, I'm a programmer" > hello.txt
```
3. Add and commit the changes with the message `"Add hello.txt"`.
```bash
$ git add hello.txt
$ git commit -m "Add hello.txt"
```
5. Push the changes to your remote `master` branch.
```bash
$ git push
# git push origin master is also fine, but unnecessarily long
```
6. Checkout the `feature` branch.
```bash
$ git checkout feature
```
7. Add the line "Java is an object-oriented programming language" to `hello.txt`.
```bash
$ echo "Java is an object-oriented programming language" >> hello.txt
```
8. Add and commit the changes with the message `"Add Java description"`.
```bash
$ git add hello.txt
$ git commit -m "Add Java description"
## ALTERNATE SOLUTION ##
$ git commit -am "Add Java description"
```
9. Checkout the `master` branch.
```bash
$ git checkout master
```
10. Replace the line "Hello world, I'm a programmer" in `hello.txt` with 2 lines:
```
This is the way the world ends
Not with a bang, but a whimper
```
```bash
$ echo "This is the way the world ends" > hello.txt
$ echo "Not with a bang, but a whimper" >> hello.txt
```
11. Add and commit the changes with the message `"Add poem lines"`.
```bash
$ git add hello.txt
$ git commit -m "Add poem lines"
## ALTERNATE SOLUTION ##
$ git commit -am "Add poem lines"
```
12. Merge `feature` into `master`. Resolve the conflict so that `hello.txt` looks like this:
```
Hello world, I'm a programmer
This is the way the world ends
Not with a bang, but a whimper
```
```bash
$ git merge feature
# at this point, you need to resolve the conflict
# with some sort of editor
$ git add hello.txt
$ git commit
# you can also use git commit -am to skip the git add
## ALTERNATE SOLUTION ##
$ git merge feature
$ echo "Hello world, I'm a programmer" > hello.txt
$ echo "This is the way the world ends" >> hello.txt
$ echo "Not with a bang, but a whimper" >> hello.txt
$ git add hello.txt
$ git commit
# you can also use git commit -am to skip the git add
```
13. Push the changes to your remote `master` branch.
```bash
$ git push
# git push origin master is also fine, but longer
```

Go to the official [Learn Code Unit 7](https://github.com/omega9656/learn-code-unit-7) repository.

**For solution to steps 1-3 below, see [pull requests](/learn-code/learn/unit7/github#pull-requests).**

1. Create a new pull request by comparing `omega9656:master` with `your_username:master` (where
`your_username` is replaced by your GitHub username).
2. Be sure to include a concise title and description of what changed.
3. Label your pull request with the green `practice` label.
