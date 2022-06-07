import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'len'
})
export class LengthPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    var x:string=<string>value;
    return x.length;
  }

}
