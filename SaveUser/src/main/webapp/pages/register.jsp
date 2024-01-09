<!DOCTYPE html>
<html>
    
    
<head>
    <title>Fill Data</title>

    <style>
        input[type="text"],
        input[type="password"],
        input[type="number"] {
            padding: 10px;
        }
    </style>
</head>
<body>
    <center><b><h2>Fill Data</h2></b></center>
    <hr>
    <form>
     <input name = "username"  type="text" placeholder="Enter Name"><br><br>
     <input name="password" type="password" placeholder="Enter Password"><br><br>
     <input name="mobileno" type="number" placeholder="Enter 10-digit mobile number"><br><br>
    <input name="email" placeholder="Enter Email" type="text"><br>
    <hr>
    <br>
    <input type="submit" value="Register" formaction="saveUser" formmethod="POST">
    </form>
</style>
</body>
</html>