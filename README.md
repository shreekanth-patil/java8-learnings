# java8-learnings by - @auther - Shreekanth Patil
Java 8 features by examples
1. Funcationl Interface
2. Method Reference
3. Lambda expression
4. Streams

## Configure Git for the first time

```
git config --global user.name "FirstName LastName"
git config --global user.email "emailaddress"

```
## Working with your repository
### **I just want to clone this repository**
If you want to simply clone this empty repository then run this command in your terminal.
```
git clone https://github.com/shreekanth-patil/Java_Leanings.git
```

### **My code is ready to be pushed**
If you already have code ready to be pushed to this repository then run this in your terminal.
```
cd existing-project
git init
git add --all
git commit -m "Initial Commit"
git remote add origin https://github.com/shreekanth-patil/Java_Leanings.git
git push -u origin master
```
### **My code is already tracked by Git**
If your code is already tracked by Git then set this repository as your "origin" to push to.
```
cd existing-project
git remote set-url origin https://github.com/shreekanth-patil/Java_Leanings.git
git push -u origin master
```
