#include "repro.h"

struct Bar bar() {
	return (struct Bar) {
		.boo = 5
	};
};

struct Foo foo = {
	.bar = bar
};
