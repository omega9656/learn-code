---
layout: default
title: Command Line
permalink: learn/unit7/command-line
parent: Unit 7
grand_parent: Learn
nav_order: 2
---

<!-- prettier-ignore-start -->

# Unit 7: Command Line
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Command Line

At some point in your life you have probably tried to use
Command Prompt (Windows) or Terminal (Mac). It was probably very
confusing and hard to use. That's because they both use
command line interfaces (CLIs), which are entirely text based, as opposed
to graphic user interfaces (GUIs), which you're used to (e.g.
clicking things).

However, as a programmer, you will need to familiarize yourself
with at least the basics of the command line in order to
navigate file systems and use Git, which is a popular version control system
we will learn about later (see [Git](/learn-code/learn/unit7/git)).

So let's get started!

## Notes before we begin

### Be Careful!

**Be _EXTREMELY_ careful when entering commands into the command line.**

Because it is text based and can modify practically everything on your
computer, it's very easy to make a typo and then accidentally delete
everything on your computer. (It probably won't be _that_ bad,
but it [happened to the animators of Toy Story 2](https://www.mentalfloss.com/uk/entertainment/27204/how-one-line-of-text-nearly-killed-toy-story-2), so just be careful.)

### Bash

The 2 most popular CLIs are DOS (Windows) and bash (Mac, Linux). Each
has its own commands. In this course, we will be learning basic bash.

If you are a knowledgeable Windows user who would like to contribute DOS content, please do! See [Contributing](/learn-code/#contributing).

### Follow Along

We highly recommend that from now on when you read this section
and come across an example, you try using that command on your own
command line. Note that examples should be followed in order if you want it to work properly.

To follow along, you'll need to download or clone the
[omega9656/learn-code-unit-7](https://github.com/omega9656/learn-code-unit-7) repository. See the Usage section in the README file.

Here is a diagram of the file hierarchy on that repository:

```
|--src
|   |--com
|       |--omegarobotics
|                |--books.txt
|                |--opmode.txt
|                |--songs.txt
|                |--tvshows.txt
|
|--README.md
```

### File Paths

On Windows, file paths use back slashes (\\). On Mac, they use forward slashes (/).
If you use \ on a Mac it will still understand what you mean though.

### Examples

In the examples we show you here, anything that starts with `#` is a comment. The `$` symbol indicates the command prompt.
You aren't supposed to type this in, it should just be there. If the line does not start with `$`, that means it is output displayed on the terminal.

## Terms You Should Know

| Term | Definition |
| :--- | :--- |
| `~` | Home directory |
| directory | Folder |
| root directory | Parent directory of a project |
| path | Directories that lead to a file (for example, `src/com/omegarobotics`) |
| absolute path | Path from the root to a file |
| relative path | Path from the current directory to a file |
| (file) extension | Thing that goes after the file name which tells you what the file type is (for example, `.pdf`) |
| `src` | "source", usually where all the code is in a project |
| flag | An option that modifies a command (for example, `-m`). You can also chain flags (for example, `-a -m` is equivalent to `-am` or `-ma`). |

## Commands You Should Know

### cd

This command allows you to **c**hange **d**irectories.

**Usage**

```bash
$ cd <path>
```

**Examples**

Start in the root directory of the Learn Code Unit 7 repository (we'll call this the U7 repo from now on).

```bash
$ cd src
$ cd com
$ cd omegarobotics
```

You should now be in `src/com/omegarobotics`.

Alternatively, you can give a relative path to
go to that directory all in one line.

```bash
$ cd src/com/omegarobotics
```

To go "up" a directory, use:

```bash
$ cd ..
```

You can use `..` in a relative path. Start in `src/com/omegarobotics`. For example:

```bash
$ cd ../../..
```

Note that `.` refers to the current directory.

You should now be in the root directory of the U7 repo.

To go to the home directory, use:

```bash
$ cd ~
```

To go to the last directory you were in, use:

```bash
$ cd -
```

### ls

This command allows you to list all of the files and directories in the current directory.

**Usage**

```bash
$ ls
```

**Options**

The `-a` flag lists all files, including hidden files (which start with `.`).

```bash
$ ls -a
```

The `-l` flag lists all files in detailed, vertical format.

```bash
$ ls -l
```

**Examples**

`cd` into `src/com/omegarobotics`.

```bash
$ ls
books.txt   opmode.txt  songs.txt   tvshows.txt
```

`-a` flag

```bash
$ ls -a
.           ..          books.txt   opmode.txt  songs.txt   tvshows.txt
```

`-l` flag

```bash
$ ls -l
total 32
-rw-r--r--  1 janedoe  staff  225 Aug  4 22:26 books.txt
-rw-r--r--  1 janedoe  staff  424 Aug  4 22:25 opmode.txt
-rw-r--r--  1 janedoe  staff  210 Aug  4 22:23 songs.txt
-rw-r--r--  1 janedoe  staff  100 Aug  4 22:21 tvshows.txt
```

**Note**: You don't really need to worry about what all of that text means. Basically, it's just more details about the file, such as read/write permissions, users, user groups,
date/times, etc.

### clear

`clear` clears the terminal of previous commands and output.

**Usage**

```bash
$ clear
```

### pwd

`pwd` **p**rints the **w**orking (current) **d**irectory.

**Usage**

```bash
$ pwd
```

**Example**

Start in the root directory of the U7 repo.

```bash
$ cd src/com/omegarobotics
$ pwd
/Users/janedoe/Desktop/learn-code-unit-7/src/com/omegarobotics
```

### mkdir

`mkdir` makes a new directory in the current directory you are in.

**Usage**

```bash
$ mkdir <name>
```

**Example**

Start in the root directory of the U7 repo.

```bash
$ cd src/com
$ mkdir hello
$ ls
hello         omegarobotics
```

### touch

`touch` is used to create a new file in the current directory.

**Usage**

```bash
$ touch <file>
```

**Examples**

Start in the root directory of the U7 repo.

```bash
$ cd src/com/hello
$ touch hello.txt
$ touch world.txt
$ ls
hello.txt world.txt
```

### rm

`rm` is used to remove files or directories.

**Usage**

```bash
$ rm <path>
```

**Options**

The `-r` flag (for _recursive_) allows you to remove
a directory which contains files.

```bash
$ rm -r <path>
```

**Examples**

Start in the root directory of the U7 repo.

```bash
$ cd src/com/hello
$ rm world.txt
$ ls
hello.txt
```

Start in the root directory of the U7 repo.

```bash
$ cd src/com
$ rm -r hello
$ ls
omegarobotics
```

### rmdir

`rmdir` removes the given directory, assuming it is empty.
(For non-empty directories, use `rm -r <path>`).

**Usage**

```bash
$ rmdir <path>
```

**Examples**

Start in the root directory of the U7 repo.

```bash
$ mkdir empty
$ ls
README.md empty     src
$ rmdir empty
$ ls
README.md src
```

### help

`help` prints some commands and their usages.

**Usage**

```bash
$ help
```

**Examples**

```bash
$ help
GNU bash, version 3.2.57(1)-release (x86_64-apple-darwin19)
These shell commands are defined internally.  Type `help' to see this list.
Type `help name' to find out more about the function `name'.
Use `info bash' to find out more about the shell in general.
Use `man -k' or `info' to find out more about commands not in this list.

A star (*) next to a name means that the command is disabled.

 JOB_SPEC [&]                       (( expression ))
 . filename [arguments]             :
 [ arg... ]                         [[ expression ]]
 alias [-p] [name[=value] ... ]     bg [job_spec ...]
 bind [-lpvsPVS] [-m keymap] [-f fi break [n]
 builtin [shell-builtin [arg ...]]  caller [EXPR]
 case WORD in [PATTERN [| PATTERN]. cd [-L|-P] [dir]
 command [-pVv] command [arg ...]   compgen [-abcdefgjksuv] [-o option
 complete [-abcdefgjksuv] [-pr] [-o continue [n]
 declare [-afFirtx] [-p] [name[=val dirs [-clpv] [+N] [-N]
 disown [-h] [-ar] [jobspec ...]    echo [-neE] [arg ...]
 enable [-pnds] [-a] [-f filename]  eval [arg ...]
 exec [-cl] [-a name] file [redirec exit [n]
 export [-nf] [name[=value] ...] or false
 fc [-e ename] [-nlr] [first] [last fg [job_spec]
 for NAME [in WORDS ... ;] do COMMA for (( exp1; exp2; exp3 )); do COM
 function NAME { COMMANDS ; } or NA getopts optstring name [arg]
 hash [-lr] [-p pathname] [-dt] [na help [-s] [pattern ...]
 history [-c] [-d offset] [n] or hi if COMMANDS; then COMMANDS; [ elif
 jobs [-lnprs] [jobspec ...] or job kill [-s sigspec | -n signum | -si
 let arg [arg ...]                  local name[=value] ...
 logout                             popd [+N | -N] [-n]
 printf [-v var] format [arguments] pushd [dir | +N | -N] [-n]
 pwd [-LP]                          read [-ers] [-u fd] [-t timeout] [
 readonly [-af] [name[=value] ...]  return [n]
 select NAME [in WORDS ... ;] do CO set [--abefhkmnptuvxBCHP] [-o opti
 shift [n]                          shopt [-pqsu] [-o long-option] opt
 source filename [arguments]        suspend [-f]
 test [expr]                        time [-p] PIPELINE
 times                              trap [-lp] [arg signal_spec ...]
 true                               type [-afptP] name [name ...]
 typeset [-afFirtx] [-p] name[=valu ulimit [-SHacdfilmnpqstuvx] [limit
 umask [-p] [-S] [mode]             unalias [-a] name [name ...]
 unset [-f] [-v] [name ...]         until COMMANDS; do COMMANDS; done
 variables - Some variable names an wait [n]
 while COMMANDS; do COMMANDS; done  { COMMANDS ; }
```

### cat

`cat` displays the contents of a file.

**Usage**

```bash
$ cat <file>
```

**Examples**

Start in the root directory of the U7 repo.

```bash
$ cd src/com/omegarobotics
$ cat books.txt
Six of Crows by Leigh Bardugo
Crooked Kingdom by Leigh Bardugo
Legend by Marie Lu
To Kill a Mockingbird by Harper Lee
The Great Gatsby by F. Scott Fitzgerald
The Lightning Thief by Rick Riordan
Fahrenheit 451 by Ray Bradbury
```

### echo

`echo` echoes any text you type in. It is usually used to add text to a file.

**Usage**

```bash
$ echo <text>
```

**Examples**

Using `echo` just for fun

```bash
$ echo Hello World!
Hello World!
```

Using `echo` to add text to a file

Start in the root directory of the U7 repo.

```bash
$ cd src/com/omegarobotics
$ cat songs.txt
She Used to Be Mine by Sara Bareilles
City of Stars by Ryan Gosling and Emma Stone
In My Blood by Shawn Mendes
Radioactive by Imagine Dragons
Speechless by Naomi Scott
Paris in the Rain by Lauv
Epiphany by BTS
$ echo "Echo by Jason Walker" >> songs.txt
$ cat songs.txt
She Used to Be Mine by Sara Bareilles
City of Stars by Ryan Gosling and Emma Stone
In My Blood by Shawn Mendes
Radioactive by Imagine Dragons
Speechless by Naomi Scott
Paris in the Rain by Lauv
Epiphany by BTS
Echo by Jason Walker
```

**Note**: To append to a file, use `>>`. To overwrite a file, use `>`.

## Further Reading

You might find these references to be useful:

- [Bash reference](https://ss64.com/bash/)
- [DOS Reference](https://docs.microsoft.com/en-us/windows-server/administration/windows-commands/windows-commands)

Practical guides:

- [Ubuntu Tutorials: Command Line for Beginners](https://ubuntu.com/tutorials/command-line-for-beginners#1-overview)
- [lifehacker: A Command Line Primer for Beginners](https://ubuntu.com/tutorials/command-line-for-beginners#1-overview)
