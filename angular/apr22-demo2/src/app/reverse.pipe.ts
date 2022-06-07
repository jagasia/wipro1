import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'reverse'
})
export class ReversePipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    var x:string=<string>value;
    //reverse the string x
    x=x.split("").reverse().join("");
    return x;
  }

}
