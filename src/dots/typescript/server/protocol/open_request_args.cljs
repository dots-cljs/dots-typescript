(ns dots.typescript.server.protocol.open-request-args
  "Information found in an \"open\" request.")

(defn file-content
  "Used when a version of the file content is known to be more up to date than the one on disk.
   Then the known content will be used upon opening instead of the disk copy
   
   **Returns:** `string | undefined`"
  ^js [open-request-args]
  (.-fileContent ^js open-request-args))

(defn set-file-content!
  "Used when a version of the file content is known to be more up to date than the one on disk.
   Then the known content will be used upon opening instead of the disk copy"
  ^js [open-request-args value]
  (set! (.-fileContent ^js open-request-args) value))

(defn script-kind-name
  "Used to specify the script kind of the file explicitly. It could be one of the following:
        \"TS\", \"JS\", \"TSX\", \"JSX\"
   
   **Returns:** `ScriptKindName | undefined`"
  ^js [open-request-args]
  (.-scriptKindName ^js open-request-args))

(defn set-script-kind-name!
  "Used to specify the script kind of the file explicitly. It could be one of the following:
        \"TS\", \"JS\", \"TSX\", \"JSX\""
  ^js [open-request-args value]
  (set! (.-scriptKindName ^js open-request-args) value))

(defn project-root-path
  "Used to limit the searching for project config file. If given the searching will stop at this
   root path; otherwise it will go all the way up to the dist root path.
   
   **Returns:** `string | undefined`"
  ^js [open-request-args]
  (.-projectRootPath ^js open-request-args))

(defn set-project-root-path!
  "Used to limit the searching for project config file. If given the searching will stop at this
   root path; otherwise it will go all the way up to the dist root path."
  ^js [open-request-args value]
  (set! (.-projectRootPath ^js open-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [open-request-args]
  (.-file ^js open-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [open-request-args value]
  (set! (.-file ^js open-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [open-request-args]
  (.-projectFileName ^js open-request-args))

(defn set-project-file-name!
  ^js [open-request-args value]
  (set! (.-projectFileName ^js open-request-args) value))
