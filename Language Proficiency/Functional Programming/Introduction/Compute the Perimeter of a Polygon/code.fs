open System

let getpoint()=
    let a = Console.ReadLine().Split()
    (a.[0] |> int, a.[1] |> int)
    
let calculate (a: int * int) (a2: int * int) =
    sqrt (((pown (abs (fst a - fst a2)) 2) + (pown (abs (snd a - snd a2)) 2)) |> float)

[<EntryPoint>]
let main argv =
    let n = Console.ReadLine() |> int
    let points = [for i = 1 to n do yield getpoint()]
    let fpoints = points@[points.[0]]
    let r = List.mapi(fun i a -> if i < fpoints.Length - 1 then calculate a fpoints.[i+1] else 0.0) fpoints
    Console.WriteLine(List.sum r)
    0