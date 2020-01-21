open System

let getPoint()=
    let a = Console.ReadLine().Split()
    (a.[0] |> int, a.[1] |> int)
    
let getDistance (a: int * int) (b: int * int) =
    sqrt (((pown (abs (fst a - fst b)) 2) + (pown (abs (snd a - snd b)) 2)) |> float)

[<EntryPoint>]
let main argv =
    let n = int <| Console.ReadLine()
    let points = [for i = 1 to n do yield getPoint()]
    let fpoints = points@[points.[0]]
    let r = List.mapi(fun i a -> if i < n then getDistance a fpoints.[i+1] else 0.0) fpoints
    Console.WriteLine(List.sum r)
    0