package e1;

public class MP3 extends Item {

	private String singer;

	public MP3(String title, int playingTime, boolean gotIt, String comment, String singer) {
		super(title, playingTime, gotIt, comment);
		this.singer = singer;
	}

	@Override
	public void print() {
		System.out.print("MP3: ");
		super.print();
		System.out.print(" " + singer);
	}

}
