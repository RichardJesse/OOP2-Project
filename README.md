# **Ticketing Application**

## Table of Contents
- [**Scope of the project**](#scope-of-the-project)
- [**Migrations**](#migrations)
- [**Resources**](#resources)
- [**In case Your MySQL (XAMPP) fails**](#in-case-your-mysql-(xampp)-fails)


## Scope of the project


## Migrations

The main reason as to why we are using migrations is to ensure that we all have the same database tables through out the development process
I will just use a simple example to help us get up to speed with how the migrator can be used.
>In this example We will use the migrator to create a user table and then we will add a column for role.

1.Create the migration file by running the MigrationFileCreator class. We do this by using the make:migration command. Like so

![image](https://github.com/RichardJesse/OOP2-Project/assets/135692621/713809c0-90d7-4c0a-995c-41578fb77c8f)

The migration file has been created in the Database.Migrations package.**Note that camel Case is used in the naming**


2.In the migration file we are now going to create the different data types for the table and define contraints using the query builder.
In our case we want to create the users table that has columns for username which is a VARCHAR data type , email which also is a VARCHAR
and maybe we will have an auto-incrementing id

![image](https://github.com/RichardJesse/OOP2-Project/assets/135692621/ce2fc46b-b40d-4d61-b489-454540c56a56)

>>More Data types and contraints are in the QueryBuilder class 

3. Once the code for the migration that creates that user table is defined we now move on ahead and run the migration By running the
   MigrationRunner class.After the migration has successfully run this is what you should see
![image](https://github.com/RichardJesse/OOP2-Project/assets/135692621/7704d250-f24f-4f9e-937f-658941d27695)

And when you go to your database this is what you will see the table is With the contraints we had mentioned in step 2 above
![image](https://github.com/RichardJesse/OOP2-Project/assets/135692621/331cb1dc-c327-4996-b7fb-28752212b5d8)

In this part of the example we will add the role column to the users table we just follow the same procedure
1. We run the migration file creator and enter the command make:migration AddRolesToUsersTable

   
![image](https://github.com/RichardJesse/OOP2-Project/assets/135692621/8fcd512b-4a3b-467f-b4d3-8fae63d1b022)

2. We run the migration

   
![image](https://github.com/RichardJesse/OOP2-Project/assets/135692621/5a5859bc-01b0-4619-82e0-a9e8440e9965)

5. And the column is added with the contraints that we had mentioned

   
![image](https://github.com/RichardJesse/OOP2-Project/assets/135692621/f2913b52-d9d8-4130-bb89-824af56ee35d)















## Resources 

These are all the files you might need to make development abit easier find them in the develop branch.😊



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
