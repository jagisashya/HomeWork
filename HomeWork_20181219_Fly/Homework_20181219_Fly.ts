interface Fly {

    Fly(velocity: number);

    Land(): boolean;

}

abstract class AbsFly implements Fly {
    private _velocity: number;
    private _isLand: boolean;

    public constructor(velocity: number, isLand: boolean) {
        this.Fly(velocity);
        this.isLand(isLand);
    }


    public Fly(velocity: number) {
        if (velocity >= 0) {
            this._velocity = velocity;
        }

    }

    public isLand(isLand: boolean) {
        this._isLand = isLand;
    }

    public Land() {
        return this._isLand;
    }
    abstract output(): string;
}

class Plane extends AbsFly {
    private _pilotName: string;
    private _planeFirm: string;
    private _destlinationFly: string;

    public constructor(velocity: number, isLand: boolean, name: string, planeFirm: string, destination: string) {
        super(velocity, isLand);
        this.pilotName = name;
        this.planeFirm = planeFirm;
        this.destinationFly = destination;

    }

    set pilotName(name: string) {
        this._pilotName = name;
    }
    set planeFirm(planeFirm: string) {
        this._planeFirm = planeFirm;
    }
    set destinationFly(destinationFly: string) {
        this._destlinationFly = destinationFly;
    }

    public output(): string {
        return 'velocity => ${this._velocity}, name ==> ${this._pilotName}, company ==> ${this._planeFirm}, destination ==> ${this._destinationFlay}';
    }
}

class Afifon extends AbsFly {

    private _collor: string;
    private _price: number;

    public constructor(velocity: number, isLand: boolean, collor: string, price: number) {
        super(velocity, isLand);
        this.collor = collor;
        this.price = price;

    }

    set collor(collor: string) {
        this._collor = collor;
    }
    set price(price: number) {
        if (price > 0)
            this._price = price;
    }
    public output(): string {
        return 'velocity => ${this._velocity}, collor ==> ${this._collor}, price ==> ${this._price}';
    }
}

class Bird extends AbsFly {
    private _type: string;
    private _age: number;
    private _collor: string;

    public constructor(velocity: number, isLand: boolean, type: string, age: number, collor: string) {
        super(velocity, isLand);
        this.type = type;
        this.age = age;
        this.collor = collor;

    }

    set type(type: string) {
        this._type = type
    }

    set age(age: number) {
        if (age >= 0 && age <= 100)
            this._age = age;
    }

    set collor(collor: string) {
        this._collor = collor;
    }
    public output(): string {
        return 'velocity => ${this._velocity}, type ==> ${this._type}, age ==> ${this._age}, collor ==> ${this._collor}'
    }
}

function createIFly(): AbsFly {
    let random = Math.floor(Math.random() * 3);
    let obj1: AbsFly;
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
            console.log("Erro " + random)
        }
    }

}

let vector5: Array<AbsFly> = new Array<AbsFly>(10);
for (let i = 0; i < 10; i++) {
    vector5[i] = createIFly();

}

for (let x in vector5) {
    if (vector5[x] instanceof Plane) {
        console.log((vector5[x] as Plane).output);
    } else if (vector5[x] instanceof Bird) {
        console.log((vector5[x] as Bird).output);
    } else {
        console.log((vector5[x] as Afifon).output);
    }
    console.log(vector5[x].output)
}