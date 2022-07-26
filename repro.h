struct Bar { int boo; };

struct Foo {
	struct Bar (*bar)();
};

struct Foo foo;
