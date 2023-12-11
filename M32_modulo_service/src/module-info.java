module service.module {
	requires transitive model.module;
	requires java.persistence;
	exports service;
}