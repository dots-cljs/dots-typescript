(ns dots.typescript.method-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [method-declaration]
  (.-kind ^js method-declaration))

(defn parent
  ^js [method-declaration]
  (.-parent ^js method-declaration))

(defn modifiers
  ^js [method-declaration]
  (.-modifiers ^js method-declaration))

(defn name
  ^js [method-declaration]
  (.-name ^js method-declaration))

(defn body
  ^js [method-declaration]
  (.-body ^js method-declaration))

(defn asterisk-token
  ^js [method-declaration]
  (.-asteriskToken ^js method-declaration))

(defn question-token
  ^js [method-declaration]
  (.-questionToken ^js method-declaration))

(defn exclamation-token
  ^js [method-declaration]
  (.-exclamationToken ^js method-declaration))

(defn type-parameters
  ^js [method-declaration]
  (.-typeParameters ^js method-declaration))

(defn parameters
  ^js [method-declaration]
  (.-parameters ^js method-declaration))

(defn type
  ^js [method-declaration]
  (.-type ^js method-declaration))

(defn flags
  ^js [method-declaration]
  (.-flags ^js method-declaration))

(defn source-file
  ^js [method-declaration]
  (.getSourceFile ^js method-declaration))

(defn child-count
  (^js [method-declaration]
   (.getChildCount ^js method-declaration))
  (^js [method-declaration source-file]
   (.getChildCount ^js method-declaration source-file)))

(defn child-at
  (^js [method-declaration index]
   (.getChildAt ^js method-declaration index))
  (^js [method-declaration index source-file]
   (.getChildAt ^js method-declaration index source-file)))

(defn children
  (^js [method-declaration]
   (.getChildren ^js method-declaration))
  (^js [method-declaration source-file]
   (.getChildren ^js method-declaration source-file)))

(defn start
  (^js [method-declaration]
   (.getStart ^js method-declaration))
  (^js [method-declaration source-file]
   (.getStart ^js method-declaration source-file))
  (^js [method-declaration source-file include-js-doc-comment?]
   (.getStart ^js method-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [method-declaration]
  (.getFullStart ^js method-declaration))

(defn get-end
  ^js [method-declaration]
  (.getEnd ^js method-declaration))

(defn width
  (^js [method-declaration]
   (.getWidth ^js method-declaration))
  (^js [method-declaration source-file]
   (.getWidth ^js method-declaration source-file)))

(defn full-width
  ^js [method-declaration]
  (.getFullWidth ^js method-declaration))

(defn leading-trivia-width
  (^js [method-declaration]
   (.getLeadingTriviaWidth ^js method-declaration))
  (^js [method-declaration source-file]
   (.getLeadingTriviaWidth ^js method-declaration source-file)))

(defn full-text
  (^js [method-declaration]
   (.getFullText ^js method-declaration))
  (^js [method-declaration source-file]
   (.getFullText ^js method-declaration source-file)))

(defn text
  (^js [method-declaration]
   (.getText ^js method-declaration))
  (^js [method-declaration source-file]
   (.getText ^js method-declaration source-file)))

(defn first-token
  (^js [method-declaration]
   (.getFirstToken ^js method-declaration))
  (^js [method-declaration source-file]
   (.getFirstToken ^js method-declaration source-file)))

(defn last-token
  (^js [method-declaration]
   (.getLastToken ^js method-declaration))
  (^js [method-declaration source-file]
   (.getLastToken ^js method-declaration source-file)))

(defn for-each-child
  (^js [method-declaration cb-node]
   (.forEachChild ^js method-declaration cb-node))
  (^js [method-declaration cb-node cb-node-array]
   (.forEachChild ^js method-declaration cb-node cb-node-array)))

(defn pos
  ^js [method-declaration]
  (.-pos ^js method-declaration))

(defn end
  ^js [method-declaration]
  (.-end ^js method-declaration))
