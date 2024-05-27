(ns dots.typescript.server.protocol.external-file
  "Represents a file in external project.
   External project is project whose set of files, compilation options and open\\close state
   is maintained by the client (i.e. if all this data come from .csproj file in Visual Studio).
   External project will exist even if all files in it are closed and should be closed explicitly.
   If external project includes one or more tsconfig.json/jsconfig.json files then tsserver will
   create configured project for every config file but will maintain a link that these projects were created
   as a result of opening external project so they should be removed once external project is closed.")

(defn file-name
  "Name of file file
   
   **Returns:** `string`"
  ^js [external-file]
  (.-fileName ^js external-file))

(defn set-file-name!
  "Name of file file"
  ^js [external-file value]
  (set! (.-fileName ^js external-file) value))

(defn script-kind
  "Script kind of the file
   
   **Returns:** `ScriptKind | ScriptKindName | undefined`"
  ^js [external-file]
  (.-scriptKind ^js external-file))

(defn set-script-kind!
  "Script kind of the file"
  ^js [external-file value]
  (set! (.-scriptKind ^js external-file) value))

(defn has-mixed-content?
  "Whether file has mixed content (i.e. .cshtml file that combines html markup with C#/JavaScript)
   
   **Returns:** `boolean | undefined`"
  ^js [external-file]
  (.-hasMixedContent ^js external-file))

(defn set-has-mixed-content!
  "Whether file has mixed content (i.e. .cshtml file that combines html markup with C#/JavaScript)"
  ^js [external-file value]
  (set! (.-hasMixedContent ^js external-file) value))

(defn content
  "Content of the file
   
   **Returns:** `string | undefined`"
  ^js [external-file]
  (.-content ^js external-file))

(defn set-content!
  "Content of the file"
  ^js [external-file value]
  (set! (.-content ^js external-file) value))
