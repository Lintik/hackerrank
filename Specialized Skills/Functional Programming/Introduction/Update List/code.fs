open System
let rec r x = if String.length x < 1 then [] else System.Int32.Parse(x) :: (r (Console.ReadLine()));;
let xs = List.map (fun x -> abs x) (r (Console.ReadLine())) in xs |> List.iter (fun x -> Console.WriteLine(x));;