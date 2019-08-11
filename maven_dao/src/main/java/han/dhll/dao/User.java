package han.dhll.dao;

public class User {

	private Integer Id;
	private String name;
	private Double money;
	

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", money=" + money + "]";
	}

	public User() {
		super();
	}

	public User(Integer id, String name, Double money) {
		super();
		Id = id;
		this.name = name;
		this.money = money;
	}

}
