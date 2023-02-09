<html>
    <head>
        <title>Payslip Generator</title>
    </head>
    <body>
        <form method="post">
            <input type="text" name="name" placeholder="Name"><br>
            <input type="number" name="basic_salary" placeholder="Basic Salary"><br>
            Designation : <br>
            <select name="designation">
                <option value="Manager">Manager</option>
                <option value="Supervisor">Supervisor</option>
                <option value="Clerk">Clerk</option>
                <option value="Peon">Peon</option>
            </select><br><br>
            <button type="submit">Generate</button>
        </form>
        <?php
           if($_POST) {
            $name = $_POST["name"];
            $basic_salary = $_POST["basic_salary"];
            $designation = $_POST["designation"];
            if($designation == "Manager") {
                $conveyance_allowance = 1000;
                $extra_allowance = 500;
            } else if($designation == "Supervisor") {
                $conveyance_allowance = 750;
                $extra_allowance = 200;
            } else if($designation == "Clerk") {
                $conveyance_allowance = 500;
                $extra_allowance = 100;
            } else {
                $conveyance_allowance = 250;
                $extra_allowance = 250;
            }
            $hra = 0.25 * $basic_salary;
            $gross_salary = $basic_salary + $hra + $conveyance_allowance + $extra_allowance;
            if($gross_salary <= 2000) {
                $tax = 0;
            } else if($gross_salary <= 4000) {
                $tax = 0.03 * $gross_salary;
            } else if($gross_salary <= 5000) {
                $tax = 0.05 * $gross_salary;
            } else {
                $tax = 0.08 * $gross_salary;
            }
            $net_salary = $gross_salary - $tax;
            echo "<h2>Payslip</h2><hr>";
            echo "Name : $name<br>";
            echo "Designation : $designation<br>";
            echo "Basic Salary : $basic_salary<br>";
            echo "Conveyance Allowance : $conveyance_allowance<br>";
            echo "Extra Allowance : $extra_allowance<br>";
            echo "Gross Salary : $gross_salary<br>";
            echo "Tax : $tax<br>";
            echo "Net Salary : $net_salary<br>"; 
           }
        ?>
    </body>
</html>