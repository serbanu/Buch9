public class Proiector {

    private boolean state;
    private int volume;
    private int zoom;
    private int page;
    private int maxPage;
    private boolean frozen;
    private String[] surse;

    public Proiector(String s1, String s2, int maxPage) {
        surse = new String[2];
        surse[0] = s1;
        surse[1] = s2;
        state = false;
        volume = 1;
        zoom = 100;
        page = 1;
        this.maxPage = maxPage;
        frozen = false;
    }

    public boolean isOn() {
        return state;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void freeze() {
        frozen = true;
        System.out.println("Proiectorul este blocat.");
    }

    public void unfreeze() {
        frozen = false;
        System.out.println("Proiectorul este deblocat.");
    }

    public void switchOn() {
        if (!isOn()) {// se neaga metoda isOn
            state = true;
            frozen = false;
            System.out.println("Am pornit proiectorul.");
        } else {
            System.out.println("Proiectorul este deja pornit.");
        }
    }

    public void switchOff() {
        if (isOn()) {
            System.out.println("Am oprit proiectorul. La revedere!");
            state = false;

        } else {
            System.out.println("Proiectorul este deja oprit.");
        }
    }

    public void increaseVolume() {
        if (isOn()) {
            if (!isFrozen()) {
                volume += 5;
                if (volume > 60) {
                    volume = 60;
                }
                System.out.println("Am crescut volumul. Are valoarea " + volume);
            } else {
                System.out.println("Proiectorul este blocat.");
            }
        } else {
            System.out.println("Proiectorul nu este pornit.");
        }
    }

    public void decreaseVolume() {
        if (isOn()) {
            if (!isFrozen()) {
                volume -= 5;
                if (volume < 0) {
                    volume = 0;
                }
                System.out.println("Am scazut volumul. Are valoarea " + volume);
            } else {
                System.out.println("Proiectorul este blocat.");
            }
        } else {
            System.out.println("Proiectorul nu este pornit.");
        }
    }

    public void increaseZoom() {
        if (isOn()) {
            if (!isFrozen()) {
                zoom += 20;

                if (zoom > 200) {
                    zoom = 200;
                }
                System.out.println("Am crescut zoom-ul. Are valoarea " + zoom);
            } else {
                System.out.println("Proiectorul este blocat.");
            }
        } else {
            System.out.println("Proiectorul nu este pornit.");


        }
    }

    public void decreaseZoom() {
        if (isOn()) {
            if (!isFrozen()) {
                zoom -= 20;
                if (zoom < 100) {
                    zoom = 100;
                }
                System.out.println("Am scazut zoom-ul. Are valoarea " + zoom);
            } else {
                System.out.println("Proiectorul este blocat.");
            }
        } else {
            System.out.println("Proiectorul nu este pornit.");
        }
    }

    public void switchPageUp() {
        if (isOn()) {
            if (!isFrozen()) {
                page += 1;

                if (page > maxPage) {
                    page = maxPage;
                }
                System.out.println("Am trecut la pagina " + page);
            } else {
                System.out.println("Proiectorul este blocat.");
            }
        } else {
            System.out.println("Proiectorul nu este pornit.");
        }
    }

    public void switchPageDown() {
        if (isOn()) {
            if (!isFrozen()) {
                page -= 1;
                if (page < 1) {
                    page = 1;
                }
                System.out.println("Am trecut la pagina " + page);
            } else {
                System.out.println("Proiectorul este blocat.");
            }
        } else {
            System.out.println("Proiectorul nu este pornit.");
        }
    }

    public void adaugaSursa(String sursa) {
        String[] surseAux = new String[surse.length + 1];
        int i;
        for (i = 0; i < surse.length; ++i) {
            surseAux[i] = surse[i];
        }
        surseAux[i] = sursa;
        surse = surseAux;
    }

    public void stergeSursa(String sursa) {
        int duplicate = 0;
        for (String s : surse) {
            if (s.equalsIgnoreCase(sursa)) {
                duplicate++;
            }
        }
        String[] surseAux = new String[surse.length - duplicate];

        for (int i = 0, j = 0; i < surse.length && j < surseAux.length; ++i, ++j) {
            if (!surse[i].equalsIgnoreCase(sursa)) {
                surseAux[j] = surse[i];
                System.out.println("Am gasit sursa " + surse[i]);
            } else {
                System.out.println("Am sters " + sursa);
                j--;
            }
        }
        surse = surseAux;
    }

    public void selectSource(String source) {
        if (isOn()) {
            if (!isFrozen()) {
                boolean sourceExists = false;
                for (String s : surse) {
                    if (s.equalsIgnoreCase(source)) {
                        sourceExists = true;
                        System.out.println("Am selectat sursa " + source);
                    }
                }
                if (!sourceExists) {
                    System.out.println("Proiectorul nu suporta sursa " + source);
                }
            } else {
                System.out.println("Proiectorul este blocat.");
            }
        } else {
            System.out.println("Proiectorul nu este pornit.");
        }
    }

    public void showSources() {
        if (isOn()) {
            if (!isFrozen()) {
                System.out.print("Sursele sunt: ");
                for (String s : surse) {
                    System.out.print(s + " ");
                }
                System.out.println();
            } else {
                System.out.println("Proiectorul este blocat.");
            }
        } else {
            System.out.println("Proiectorul nu este pornit.");
        }
    }

}
