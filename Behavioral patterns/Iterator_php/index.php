<?php

use Iterator_php\BookCollection;

$book = new BookCollection();
$book->addTitle("Iterator design pattern");
$book->addTitle("PHP7 is very handy language");
$book->addTitle("Yii rules");
$book->addTitle("Apache rules");

foreach($book as $b)
	var_dump($b);

?>