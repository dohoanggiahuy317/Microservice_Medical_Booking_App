## 1. MongoDB

To run MongoDB (i.e. the mongod process) as a macOS service, run:

	```
    brew services start mongodb-community@6.0
    ```

To stop a mongod running as a macOS service, use the following command as needed:

    ```
	brew services stop mongodb-community@6.0
    ```


## 2. MySQL

After the installation is complete, you can start the MySQL service using the following command:

    ```
    brew services start mysql
    ```


Open Terminal and use the following command to stop the MySQL service:

    ```
    brew services stop mysql
    ```

Create database MySQL

    ```
    mysql -u root -p
    SHOW DATABASES;
    CREATE DATABASE order_service;
    ```

