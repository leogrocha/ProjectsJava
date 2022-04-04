package Json.FirstJson;

import java.util.LinkedList;

import com.google.gson.Gson;


public class FirstJson {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("12345678899", "user1", "senha1", "Seu Madruga");
		Usuario usuario2 = new Usuario("12345678899", "user2", "senha2", "Chaves");
		
		LinkedList<Usuario> users = new LinkedList<>();
		users.add(usuario1);
		users.add(usuario2);
		
		String json = new Gson().toJson(users);
		System.out.println(json);
	}
}
