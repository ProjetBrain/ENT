
public class Note {

		private int note;
		
		public Note() {}
		
		public int getNote(){
			return this.note;
		}
		
		public void setNote(int note){
			if(note<=20 && note>=0)
				this.note=note;
			else
				System.out.println("Ta note est incorrecte !");
		}
		
}
