package phone;

public class Phone {
	
		private int id;
		private String owner;
		private String model;
		private String color;
		
		//why is this constructor is needed?
		public Phone() {}
		
		public Phone(int id, String owner,String model, String color) {
			
			this.id = id;
			this.owner = owner;
			this.color = color;
		
		}

		public int getId() {
			return id;
		}

		
		public void setId(int id) {
			this.id = id;
		}


		public String getOwner() {
			return owner;
		}

		
		public void setOwner(String owner) {
			this.owner = owner;
		}

		
		public String getModel() {
			return model;
		}

		
		public void setModel(String model) {
			this.model = model;
		}

		
		public String getColor() {
			return color;
		}

		
		public void setColor(String color) {
			this.color = color;
		}
		
		
	}