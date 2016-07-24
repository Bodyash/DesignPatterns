<?php

namespace Iterator_php;

class BookIterator implements \Iterator{
	
	private $i_position 0;
	private $booksCollection;
	
	public function __construct(BookCollection $col){
		$this->booksCollection = $col;
	}
	
	public function current(){
		return $this->booksCollection->getTitle($this->i_position);
	}
	
	public function key(){
		return $this->i_position;
	}
	
	public function next(){
		$this->i_position++;
	}
	
	public function rewind(){
		$this->i_position = 0;
	}
	
	public function valid(){
		return !is_null($this->booksCollection->getTitle($this->i_position));
	}
}

?>