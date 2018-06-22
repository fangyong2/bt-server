#数据库用户
create schema pagination default character set utf8 collate utf8_general_ci;

CREATE USER 'admin'@'%' IDENTIFIED BY '123456'

grant select,insert,update,delete,create,drop on pagination.* to admin;

flush  PRIVILEGES;

#git相关命令
…or create a new repository on the command line
echo "# a" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/fangyong2/a.git
git push -u origin master


…or push an existing repository from the command line
git remote add origin https://github.com/fangyong2/a.git
git push -u origin master
