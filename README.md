# tp2--ex2-Gestioncourrier

exercice 2-Gestion des courrier

nom prénom : molka hamdouni

diagramme:

              ┌──────────────────────────┐
              │        Courrier          │
              ├──────────────────────────┤
              │ # modeExpedition:boolean  │
              │ # adresse:String          │
              │ + TARIF_BASE:double       │
              ├──────────────────────────┤
              │ + Courrier(...)           │
              │ + estValide():boolean     │
              │ + decrire():void          │
              │ + affranchir():double     │
              └────────────┬─────────────┘
                           △
                  ┌────────┴────────┐
                  │                 │
        ┌─────────────────┐  ┌─────────────────┐
        │     Lettre      │  │      Colis      │
        ├─────────────────┤  ├─────────────────┤
        │ - poids:double  │  │ - poids:double  │
        │ - format:String │  │ - volume:double │
        ├─────────────────┤  ├─────────────────┤
        │ + Lettre(...)   │  │ + Colis(...)    │
        │ + decrire()     │  │ + decrire()     │
        │ + affranchir()  │  │ + affranchir()  │
        └─────────────────┘  └─────────────────┘

              ┌──────────────────────────┐
              │       BoiteCourrier       │
              ├──────────────────────────┤
              │ - courriers:Courrier[]   │
              │ - nbCourriers:int        │
              ├──────────────────────────┤
              │ + BoiteCourrier(n)       │
              │ + ajouter(c):void        │
              │ + affranchir():double    │
              │ + courriersInvalides():int│
              │ + afficher():void        │
              └──────────────────────────┘
