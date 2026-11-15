package com.handicap;

import java.util.Locale;

public enum Handicap {
	BLIND("blind", "Cecità permanente", "Non puoi vedere."),
	MUTE("mute", "Mutismo", "Non puoi parlare nella chat."),
	CANCER("cancer", "Malattia debilitante", "La tua salute massima diminuisce lentamente."),
	AMPUTATED_OFFHAND("amputated_offhand", "Mano secondaria amputata", "Non puoi usare la mano secondaria."),
	SHORT("short", "Bassa statura", "Sei più piccolo e hai meno portata."),
	ASTHMA("asthma", "Asma", "Correre troppo a lungo ti lascia senza fiato."),
	NARCOLEPSY("narcolepsy", "Narcolessia", "Ti addormenti casualmente."),
	POLLEN_ALLERGY("pollen_allergy", "Allergia ai pollini", "I fiori vicini ti avvelenano."),
	INSOMNIA("insomnia", "Insonnia", "Non puoi dormire."),
	ARTHRITIS("arthritis", "Artrite", "Scavare e attaccare è più lento."),
	BRITTLE_BONES("brittle_bones", "Ossa fragili", "Subisci il doppio dei danni da caduta."),
	DEMENTIA("dementia", "Demenza", "Gli oggetti si spostano nell’inventario."),
	TOURETTES("tourettes", "Sindrome di Tourette", "La visuale scatta e scrivi frasi casuali in chat."),
	AMPUTATED_LEG("amputated_leg", "Gamba amputata", "Per muoverti devi saltare."),
	KLEPTOMANIA("kleptomania", "Cleptomania", "Non puoi lasciare cadere gli oggetti."),
	LACTOSE_INTOLERANCE("lactose_intolerance", "Intolleranza al lattosio", "Bere latte ti uccide all’istante."),
	DIABETES("diabetes", "Diabete", "Più un cibo è dolce, più ti danneggia."),
	SEIZURES("seizures", "Convulsioni", "Danni, fame o effetti negativi possono causare convulsioni."),
	OCD("ocd", "Disturbo ossessivo-compulsivo", "Ignorare una compulsione ti fa perdere mezzo cuore ogni secondo."),
	CEREBRAL_PALSY("cerebral_palsy", "Paralisi cerebrale", "Movimenti involontari casuali."),
	PARKINSONS("parkinsons", "Parkinson", "Il mirino trema continuamente."),
	ADHD("adhd", "ADHD", "La barra degli oggetti cambia selezione casualmente."),
	VERTIGO("vertigo", "Vertigini", "Il mondo inizia a girare casualmente."),
	SCHIZOPHRENIA("schizophrenia", "Allucinazioni", "Vedi e senti cose che non esistono."),
	ANOSOGNOSIA("anosognosia", "Anosognosia", "Non puoi vedere i tuoi handicap."),
	DEAF("deaf", "Sordità", "Non puoi sentire nulla."),
	SCOLIOSIS("scoliosis", "Scoliosi", "La visuale è permanentemente inclinata."),
	COLOR_BLIND("color_blind", "Daltonismo", "Vedi in bianco e nero."),
	DYSLEXIA("dyslexia", "Dislessia", "La maggior parte dei testi diventa difficile da leggere."),
	PARAPLEGIA("paraplegia", "Paraplegia", "Non puoi saltare né correre."),
	REDUCED_MOBILITY("reduced_mobility", "Mobilità ridotta", "Ti muovi più lentamente."),
	CELIAC("celiac", "Celiachia", "Mangiare pane o biscotti è fatale."),
	TINNITUS("tinnitus", "Acufene", "Un leggero fischio si sente regolarmente."),
	MUSCLE_WEAKNESS("muscle_weakness", "Debolezza muscolare", "I tuoi attacchi corpo a corpo fanno meno danni."),
	RESPIRATORY_FAILURE("respiratory_failure", "Insufficienza respiratoria", "Rimani senza aria molto più velocemente sott’acqua."),
	HYPOTENSION("hypotension", "Ipotensione", "Hai episodi di debolezza e lentezza."),
	POOR_CIRCULATION("poor_circulation", "Problemi di circolazione", "Restare fermo troppo a lungo ti rallenta."),
	CLUMSINESS("clumsiness", "Goffaggine", "A volte fai cadere l’oggetto che hai in mano."),
	FISH_ALLERGY("fish_allergy", "Allergia al pesce", "Mangiare pesce è fatale."),
	CLAUSTROPHOBIA("claustrophobia", "Claustrofobia", "Gli spazi stretti ti rallentano."),
	SLOW_REFLEXES("slow_reflexes", "Riflessi lenti", "Subire danni ti rallenta."),
	MONSTER_PHOBIA("monster_phobia", "Paura dei mostri", "I mostri vicini ti indeboliscono e ti rallentano."),
	PARTIAL_DEAFNESS("partial_deafness", "Sordità parziale", "Tutti i suoni vengono riprodotti a un quinto del volume."),
	INVERTED_VISION("inverted_vision", "Vista capovolta", "La visuale è permanentemente sottosopra."),
	HICCUPS("hiccups", "Singhiozzo", "Singhiozzi casuali fanno sobbalzare la visuale."),
	SNEEZING("sneezing", "Starnuti", "Gli starnuti fanno sobbalzare la visuale e ti rallentano."),
	JUMP_CURSE("jump_curse", "Maledizione del salto", "Salti spontaneamente più spesso."),
	MAGNET_FEET("magnet_feet", "Piedi magnetici", "Non puoi saltare per un momento dopo l’atterraggio."),
	SLEEPWALKING("sleepwalking", "Sonnambulismo", "A volte cammini in avanti senza volerlo."),
	STICKY_HAND("sticky_hand", "Mano appiccicosa", "Non puoi cambiare slot per un momento dopo averlo selezionato."),
	MYOPIA("myopia", "Miopia", "La vista è sfocata."),
	HYPEROPIA("hyperopia", "Ipermetropia", "Il terzo inferiore dello schermo è sfocato."),
	TUNNEL_VISION("tunnel_vision", "Visione a tunnel", "Il tuo campo visivo è permanentemente ristretto."),
	PHANTOM_LIGHT("phantom_light", "Lampi di luce", "Di tanto in tanto compaiono lampi accecanti."),
	SPATIAL_DISORIENTATION("spatial_disorientation", "Disorientamento spaziale", "Destra e sinistra sono invertite."),
	ARMOR_INTOLERANCE("armor_intolerance", "Intolleranza alle armature", "Non puoi indossare armature."),
	DRUNK("drunk", "Ubriachezza", "Il terreno è scivoloso e ti muovi in modo instabile."),
	SLEEP_APNEA("sleep_apnea", "Apnea notturna", "Ti svegli senza fiato e ti senti rallentato."),
	HAND_TREMORS("hand_tremors", "Tremore alle mani", "Le mani tremano e interrompono l’estrazione."),
	VISUAL_AGNOSIA("visual_agnosia", "Agnosia visiva", "I colori si confondono tra loro."),
	MIGRAINE("migraine", "Emicrania", "Gli episodi di emicrania sfocano e illuminano i bordi dello schermo."),
	BROKEN_ARM("broken_arm", "Braccio rotto", "Rompere i blocchi richiede molto più tempo."),
	PROSOPAGNOSIA("prosopagnosia", "Prosopagnosia", "Non riconosci i volti: giocatori, villici e mostri si assomigliano."),
	DEREALIZATION("derealization", "Derealizzazione", "Il mondo diventa irriconoscibile."),
	GAMBLING_ADDICTION("gambling_addiction", "Ludopatia", "Ogni minuto rischi un oggetto casuale: puoi perderlo oppure vincere una copia."),
	DOOM_SCROLLING("doom_scrolling", "Doom scrolling", "A intervalli casuali ti blocchi a fissare lo schermo."),
	PROCRASTINATION("procrastination", "Procrastinazione", "A intervalli casuali scavare e muoverti diventa molto più lento."),
	PARANOIA("paranoia", "Paranoia", "Senti presenze vicine anche quando non c’è nessuno."),
	SHOPPING_COMPULSIVE("shopping_compulsive", "Shopping compulsivo", "Ogni tanto spendi automaticamente smeraldi."),
	INVENTORY_DISORDER("inventory_disorder", "Disordine", "Gli oggetti dell’inventario cambiano spesso posizione."),
	INDECISION("indecision", "Indecisione", "A intervalli casuali esiti prima di agire e ti muovi più lentamente."),
	BAD_LUCK("bad_luck", "Sfortuna", "Piccoli contrattempi ti indeboliscono casualmente."),
	FOOD_DEPENDENCE("food_dependence", "Dipendenza dal cibo", "Quando hai fame diventi più debole del normale."),
	DISTRACTION("distraction", "Distrazione", "Perdi la concentrazione e ti blocchi per qualche secondo."),
	FOMO("fomo", "FOMO", "Hai paura di perderti qualcosa: ogni tanto vieni distratto da un avviso."),
	OVERTHINKING("overthinking", "Pensare troppo", "Rimuginare ti rallenta quando cerchi di agire.");

	public final String id;
	public final String displayName;
	public final String description;

	Handicap(String id, String displayName, String description) {
		this.id = id;
		this.displayName = displayName;
		this.description = description;
	}

	static {
		if (values().length > 128) {
			throw new IllegalStateException("Handicap only supports 128 handicaps, found " + values().length);
		}
	}

	public long bit() {
		return 1L << (ordinal() & 63);
	}

	public boolean high() {
		return ordinal() >= 64;
	}

	public static Handicap byId(String id) {
		String wanted = id.toLowerCase(Locale.ROOT);
		for (Handicap d : values()) {
			if (d.id.equals(wanted)) {
				return d;
			}
		}
		return null;
	}
}
