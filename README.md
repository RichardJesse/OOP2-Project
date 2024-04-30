# **Ticketing Application**

## Table of Contents
- [**Scope of the project**](#scope-of-the-project)
- [**Migrations**](#migrations)
- [**In case Your MySQL (XAMPP) fails**](#in-case-your-mysql-(xampp)-fails)


## Scope of the project


## Migrations

## Incase Your Mysql(XAMPP) fails <a name="in-case-your-mysql-(xampp)-fails"></a>

This is a very typical error for mysql when you experience it.Follow the following steps to fix it
  **This error occurs when your mysql shuts down unexpectedly**
  
  1.First navigate to your xampp directory then open the mysql directory then go to the data folder.
         while there delete the following files
         
              **aria_log.00000001**
              **aria_log_control**
              **ib_buffer_pool**
              **ib_logfile0**
              **ib_logfile1**
              
              
  2.From XAMPP control panel, open "Config" [mysql] and add the following line under [mysqld] = innodb_force_recovery = 1

  
  3.Open shell from control panel and start mysql with this command
  
  ```bash
mysqld –-console –-skip-grant-tables –-skip-external-locking
Open another shell from control panel and repair database with this command:
mysqlcheck -r --databases mysql --use-frm
Stop mysql, close shells and restart mysql normally.

```
