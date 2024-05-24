(ns dots.typescript.server.protocol.set-compiler-options-for-inferred-projects-request
  "Request to set compiler options for inferred projects.
   External projects are opened / closed explicitly.
   Configured projects are opened when user opens loose file that has 'tsconfig.json' or 'jsconfig.json' anywhere in one of containing folders.
   This configuration file will be used to obtain a list of files and configuration settings for the project.
   Inferred projects are created when user opens a loose file that is not the part of external project
   or configured project and will contain only open file and transitive closure of referenced files if 'useOneInferredProject' is false,
   or all open loose files and its transitive closure of referenced files if 'useOneInferredProject' is true."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [set-compiler-options-for-inferred-projects-request]
  (.-command ^js set-compiler-options-for-inferred-projects-request))

(defn set-command!
  ^js [set-compiler-options-for-inferred-projects-request value]
  (set! (.-command ^js set-compiler-options-for-inferred-projects-request) value))

(defn arguments
  ^js [set-compiler-options-for-inferred-projects-request]
  (.-arguments ^js set-compiler-options-for-inferred-projects-request))

(defn set-arguments!
  ^js [set-compiler-options-for-inferred-projects-request value]
  (set! (.-arguments ^js set-compiler-options-for-inferred-projects-request) value))

(defn type
  ^js [set-compiler-options-for-inferred-projects-request]
  (.-type ^js set-compiler-options-for-inferred-projects-request))

(defn set-type!
  ^js [set-compiler-options-for-inferred-projects-request value]
  (set! (.-type ^js set-compiler-options-for-inferred-projects-request) value))

(defn seq
  "Sequence number of the message"
  ^js [set-compiler-options-for-inferred-projects-request]
  (.-seq ^js set-compiler-options-for-inferred-projects-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [set-compiler-options-for-inferred-projects-request value]
  (set! (.-seq ^js set-compiler-options-for-inferred-projects-request) value))
