package restaurant.view;

import java.util.ArrayList;

import restaurant.controller.RestaurantController;
import restaurant.domain.RestaurantDTO;
import restaurant.service.RestaurantService;

public class RestaurantStartView {

	public static void main(String[] args) {
		RestaurantDTO restaurant = new RestaurantDTO("삼성", "멀티캠퍼스", "서울특별시 강남구 역삼동", "02-3429-5119");
		
		RestaurantService service = RestaurantService.getInstance();
		
		//System.out.println("***** 새로운 Restaurant 생성 후 확인 *****");
		//ArrayList<RestaurantDTO> allrestaurant = service.getAllRestaurant();
		//RestaurantEndView.aListdataView(allrestaurant);
		//service.restaurantInsert(restaurant);
		//RestaurantEndView.aListdataView(allrestaurant);
		
		//System.out.println("***** 정삭삭제 확인 *****");
		//RestaurantController.deleteOne("공부가");
		//RestaurantEndView.aListdataView(allrestaurant);
		//RestaurantController.deleteOne("공부가");
		
		//System.out.println("***** 전화번호 수정 확인 *****");
		//RestaurantController.updatepNumber("멀티캠퍼스","010-8835-1334");
		//RestaurantEndView.aListdataView(allrestaurant);
		//RestaurantController.updatepNumber("501호","010-8835-1334");
		 
		System.out.println(RestaurantService.sb_gangnam);
	}
}
