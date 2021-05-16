import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.SaleManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateCampaignDao;
import dataAccess.concretes.HibernateGameDao;
import dataAccess.concretes.HibernateSaleDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Sale;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new HibernateUserDao());
		userManager.add(Hatice());
		userManager.add(Emre());

		CampaignManager campaignManager = new CampaignManager(new HibernateCampaignDao());
		campaignManager.add(Yaz());
		campaignManager.add(IlkBahar());

		GameManager gameManager = new GameManager(new HibernateGameDao());
		gameManager.add(AgeOfCodes());
		gameManager.add(CallOfDuty());

		SaleManager saleManager = new SaleManager(new HibernateSaleDao());
		saleManager.CampaignSale(Yaz(), Emre(), Cart(), AgeOfCodes());

		saleManager.Sale(Hatice(), CallOfDuty(), Cart());

	}

	private static Sale Cart() {
		Sale sale = new Sale(1, "4185 6985 7412 9832");
		return sale;
	}

	private static Campaign Yaz() {
		Campaign campaign = new Campaign();
		campaign.setId(2);
		campaign.setDiscountName("Yaz indirimi");
		campaign.setDiscount(75);
		return campaign;
	}

	private static Campaign IlkBahar() {
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setDiscountName("İlkbahar indirimi");
		campaign.setDiscount(20);
		return campaign;
	}

	private static Game CallOfDuty() {
		Game game = new Game();

		game.setId(1);
		game.setGameName("Call Of Duty");
		game.setGameComment("ikinci dünya savaşı sırasında yaşananları teçrübe edeceksiniz");
		game.setGameCategory("Aksiyon, Strateji");
		game.setPrice(350);
		return game;
	}

	private static Game AgeOfCodes() {
		Game game = new Game();

		game.setId(1);
		game.setGameName("Age Of Codes");
		game.setGameComment("kodların çağlar boyunca uğradığı değişim serüveni.");
		game.setGameCategory("İzometrik, macera");
		game.setPrice(50);
		return game;
	}

	private static User Hatice() {
		User user = new User();
		user.setId(2);
		user.setName("Hatice");
		user.setSurName("Kızıltaş");
		user.setnId("85977789192");
		user.setBirthOfYear(1996);
		user.setEmail("Hatice@furkan.com");
		user.setPassword("9875461");
		return user;
	}

	private static User Emre() {
		User user = new User();
		user.setId(1);
		user.setName("Emre");
		user.setSurName("Pelvan");
		user.setnId("85977789124");
		user.setBirthOfYear(1996);
		user.setEmail("emre@furkan.com");
		user.setPassword("987546331");
		return user;
	}

}
