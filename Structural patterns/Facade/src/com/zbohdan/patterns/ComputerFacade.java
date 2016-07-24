package com.zbohdan.patterns;

public class ComputerFacade {
	
	private CPU processor;
	private Memory ram;
	private HardDrive hd;
	
	//Constants
	private final int BOOT_ADDRESS = 5;
	private final int BOOT_SECTOR = 46;
	private final int SECTOR_SIZE = 8;
	
	public ComputerFacade(){
		
		processor = new CPU();
		ram = new Memory();
		hd = new HardDrive();
	}
	
	public void start(){
		
		processor.freeze();
		ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
		processor.jump(BOOT_ADDRESS);
		processor.execute();
	} 

}
