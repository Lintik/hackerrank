open System

let readInputs() = 
  Seq.initInfinite (fun _ -> Console.ReadLine())
  |> Seq.takeWhile (fun s -> s <> null)

[<EntryPoint>]
let main argv = 
    readInputs()
    |> Seq.mapi (fun i s -> i, int s)
    |> Seq.choose (fun (i, n) ->
      if i % 2 <> 0 then Some n else None)
    |> Seq.iter (printfn "%i")
    0