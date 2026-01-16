<?php
header('Content-Type: text/plain; charset=utf-8');
$name = isset($_GET['name']) ? htmlspecialchars($_GET['name'], ENT_QUOTES, 'UTF-8') : "Cédric";
echo "Bonjour, je m'appelle $name";
?>