<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
        <form method="post">
            <h2>Login</h2><hr>
            Username <input type="text" name="username"><br><br>
            Password <input type="password" name="password"><br><br>
            <button type="submit">Submit</button>
        </form>
        <?php
            $servername = "localhost";
            $db_username = "root";
            $db_password = "";
            $dbname = "auth";
            $conn = mysqli_connect($servername,$db_username,$db_password,$dbname);
            if(!$conn) {
                die("Connection Not Established");
            }
            if($_POST) {
                $username = $_POST["username"];
                $password = $_POST["password"];
                $query = "SELECT * FROM login WHERE username = '$username' AND password = '$password'";
                $result = mysqli_query($conn,$query);
                $number_of_rows = mysqli_num_rows($result);
                if($number_of_rows == 1) {
                    echo "<h2>Login Success</h2>";
                } else {
                    echo "<h2>Login Failed</h2>";
                }
            }
            mysqli_close($conn);
        ?>
    </body>
</html>