import fetin.OrganizaFetin;

public class Main {

    public static void main(String[] args) {

            OrganizaFetin fetim = new OrganizaFetin();

            try {
                fetim.addProjeto("Avião teleguiado", 10);
            } catch (Exception e){
                System.out.println(e);
            } try {
                fetim.addProjeto("BitField", 60);
            } catch (Exception e){
                System.out.println(e);
            } try {
                fetim.addProjeto("BitField", 78);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

