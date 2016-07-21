package training;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class PenguinFun {

	public static void main(String [] args){
		Penguin pingu = null;
		PenguinHatchery penguinHatchery = new PenguinHatchery();
		ArrayList<Penguin>  listaPingu = new ArrayList<>();
		HashSet<Penguin> hsPingu = new HashSet<>();
		Map<PenguinRace,List<Penguin>> mapPingu = new HashMap();


		//Populeaza lista/HashSet
		for(int i = 0; i < 10 ; i++){
			pingu = penguinHatchery.hatchPenguin();
			penguinHatchery.generateMatingPartners(pingu);
			//listaPingu.add(penguinHatchery.hatchPenguin());
			//hsPingu.add(penguinHatchery.hatchPenguin());
			listaPingu.add(pingu);
			hsPingu.add(pingu);

		}

		System.out.println("Pinguinii adaugati in lista:");
		printLs(listaPingu);

		System.out.println("\nPinguinii adaugati in HashSet:\n");
		printHs(hsPingu);

		Comparator<Penguin> comparator = new Comparator<Penguin>() {
			@Override
			public int compare(Penguin o1, Penguin o2) {
				if(o1.getRace().toString().equals(o2.getRace().toString())) {
					if (o1.getAge() == o2.getAge()){
						return 0;
					} else if(o1.getAge() < o2.getAge()){
						return -1;
					} else {
						return 1;
					}

				}

				return o1.getRace().toString().compareTo(o2.getRace().toString());
			}
		};

		Comparator<Penguin> comparator1 = new Comparator<Penguin>() {
			@Override
			public int compare(Penguin o1, Penguin o2) {
				if(o1.getMatingPartners().size() == o2.getMatingPartners().size()){
					double avg1 = avgAgeMatingPartmers(o1);
					double avg2 = avgAgeMatingPartmers(o2);

					if(avg1 == avg2){
						if(o1.getName().charAt(6) == o2.getName().charAt(6)) {

							return 0;
						}else if (o1.getName().charAt(6) < o2.getName().charAt(6)){
							return -1;
						}else {
							return 1;
						}
				}else if (avg1 < avg2){
						return -1;
					}else {
						return 1;
					}
				} else if (o1.getMatingPartners().size() < o2.getMatingPartners().size()){
					return -1;
				}
				else {
					return 1;
				}
			}

		};

		System.out.println("\nPinguini ordonati dupa rasa -> varsta\n");
		System.out.println();
		Collections.sort(listaPingu, comparator);
		printLs(listaPingu);

		System.out.println("\nPinguini ordonati dupa numarul de parteneri -> media varstelor partenerilor -> nume\n");
		Collections.sort(listaPingu, comparator1);
		printLs(listaPingu);

		System.out.println("\nPinguini grupati dupa rasa -> HashMap");


		for(Penguin p : listaPingu){
			List<Penguin> aux = mapPingu.get(p.getRace()); //aux = lista de pinguini care au aceeasi rasa cu pinguinul curent
			if (aux == null){
				aux = new ArrayList<Penguin>(); //daca nu mai sunt alti pinguini care au rasa = cu a pinguinului curent se creeaza lista
			}
			aux.add(p); // se adauga pinguinul curent in lista cu pinguinii care au aceeasi rasa cu a lui
			mapPingu.put(p.getRace(),aux); // se pun pinguinii la loc in map

		}

		for(PenguinRace rasa : PenguinRace.values()){
			List<Penguin> listaRasa = mapPingu.get(rasa);
			System.out.println("\nRasa curenta: " + rasa + listaRasa);
		}


	}

	private static void printLs(List<Penguin> list) {
		for (Penguin p : list) {
			System.out.println(p);
		}
	}
	private static void printHs(HashSet<Penguin> hashSet){
		for (Penguin pg : hashSet){
			System.out.println(pg);
		}
	}

	//Calcul varsta medie parteneri
	private static double avgAgeMatingPartmers(Penguin pingu){
		List<Penguin> matingPartners = pingu.getMatingPartners();
		int avgAge = 0;

		for (int i = 0; i < matingPartners.size(); i++){
			avgAge += matingPartners.get(i).getAge();

		}
		if (matingPartners.size() == 0){
			return 0;
		}else {
			return avgAge / matingPartners.size();
		}
	}

}	
