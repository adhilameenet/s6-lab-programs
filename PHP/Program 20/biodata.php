<html>
    <head>
        <title>Program 20</title>
    </head>
    <body>
        <form method="post">
            Name  <input type="text" name="name"><br><br>
            Age  <input type="number" name="age"><br><br>
            Email  <input type="email" name="email"><br><br>
            Gender <br>
            Male <input type="radio" name="gender" value="male">
            Female <input type="radio" name="gender" value="female"><br>
            Qualification : 
            <select name="qualification">
                <option value="SSLC">SSLC</option>
                <option value="PLUS TWO">PLUS TWO</option>
                <option value="UG">UG</option>
                <option value="PG">PG</option>
            </select><br><br>
            <button type="submit">Submit</button>
        </form>
        <?php
            if($_POST) {
                $name = $_POST["name"];
                $age = $_POST["age"];
                $email = $_POST["email"];
                $gender = $_POST["gender"];
                $qualification = $_POST["qualification"];
                echo "<h2>Bio Data</h2><hr>";
                echo "Name : $name<br>";
                echo "Age : $age<br>";
                echo "Email : $email<br>";
                echo "Gender : $gender<br>";
                echo "Qualification : $qualification<br>";
            }
        ?>
    </body>
</html>
