var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var AbsFly = /** @class */ (function () {
    function AbsFly(velocity, isLand) {
        this.Fly(velocity);
        this.isLand(isLand);
    }
    AbsFly.prototype.Fly = function (velocity) {
        if (velocity >= 0) {
            this._velocity = velocity;
        }
    };
    AbsFly.prototype.isLand = function (isLand) {
        this._isLand = isLand;
    };
    AbsFly.prototype.Land = function () {
        return this._isLand;
    };
    return AbsFly;
}());
var Plane = /** @class */ (function (_super) {
    __extends(Plane, _super);
    function Plane(velocity, isLand, name, planeFirm, destination) {
        var _this = _super.call(this, velocity, isLand) || this;
        _this.pilotName = name;
        _this.planeFirm = planeFirm;
        _this.destinationFly = destination;
        return _this;
    }
    Object.defineProperty(Plane.prototype, "pilotName", {
        set: function (name) {
            this._pilotName = name;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Plane.prototype, "planeFirm", {
        set: function (planeFirm) {
            this._planeFirm = planeFirm;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Plane.prototype, "destinationFly", {
        set: function (destinationFly) {
            this._destlinationFly = destinationFly;
        },
        enumerable: true,
        configurable: true
    });
    Plane.prototype.output = function () {
        return 'velocity => ${this._velocity}, name ==> ${this._pilotName}, company ==> ${this._planeFirm}, destination ==> ${this._destinationFlay}';
    };
    return Plane;
}(AbsFly));
var Afifon = /** @class */ (function (_super) {
    __extends(Afifon, _super);
    function Afifon(velocity, isLand, collor, price) {
        var _this = _super.call(this, velocity, isLand) || this;
        _this.collor = collor;
        _this.price = price;
        return _this;
    }
    Object.defineProperty(Afifon.prototype, "collor", {
        set: function (collor) {
            this._collor = collor;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Afifon.prototype, "price", {
        set: function (price) {
            if (price > 0)
                this._price = price;
        },
        enumerable: true,
        configurable: true
    });
    Afifon.prototype.output = function () {
        return 'velocity => ${this._velocity}, collor ==> ${this._collor}, price ==> ${this._price}';
    };
    return Afifon;
}(AbsFly));
var Bird = /** @class */ (function (_super) {
    __extends(Bird, _super);
    function Bird(velocity, isLand, type, age, collor) {
        var _this = _super.call(this, velocity, isLand) || this;
        _this.type = type;
        _this.age = age;
        _this.collor = collor;
        return _this;
    }
    Object.defineProperty(Bird.prototype, "type", {
        set: function (type) {
            this._type = type;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Bird.prototype, "age", {
        set: function (age) {
            if (age >= 0 && age <= 100)
                this._age = age;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Bird.prototype, "collor", {
        set: function (collor) {
            this._collor = collor;
        },
        enumerable: true,
        configurable: true
    });
    Bird.prototype.output = function () {
        return 'velocity => ${this._velocity}, type ==> ${this._type}, age ==> ${this._age}, collor ==> ${this._collor}';
    };
    return Bird;
}(AbsFly));
function createIFly() {
    var random = Math.floor(Math.random() * 3);
    var obj1;
    switch (random) {
        case 0: {
            return obj1 = new Bird(10, false, "condor", 7, "blue");
            break;
        }
        case 1: {
            return obj1 = new Plane(210, true, "Jaime", "ElAl", "Israel");
            break;
        }
        case 2: {
            return obj1 = new Afifon(5, true, "multi collor", 20.75);
            break;
        }
        default: {
            console.log("Erro " + random);
        }
    }
}
var vector5 = new Array(10);
for (var i = 0; i < 10; i++) {
    vector5[i] = createIFly();
}
for (var x in vector5) {
    if (vector5[x] instanceof Plane) {
        console.log(vector5[x].output);
    }
    else if (vector5[x] instanceof Bird) {
        console.log(vector5[x].output);
    }
    else {
        console.log(vector5[x].output);
    }
    console.log(vector5[x].output);
}
