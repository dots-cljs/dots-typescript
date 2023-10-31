(ns dots.typescript.function-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [function-declaration]
  (.-kind ^js function-declaration))

(defn modifiers
  ^js [function-declaration]
  (.-modifiers ^js function-declaration))

(defn name
  ^js [function-declaration]
  (.-name ^js function-declaration))

(defn body
  ^js [function-declaration]
  (.-body ^js function-declaration))

(defn asterisk-token
  ^js [function-declaration]
  (.-asteriskToken ^js function-declaration))

(defn question-token
  ^js [function-declaration]
  (.-questionToken ^js function-declaration))

(defn exclamation-token
  ^js [function-declaration]
  (.-exclamationToken ^js function-declaration))

(defn type-parameters
  ^js [function-declaration]
  (.-typeParameters ^js function-declaration))

(defn parameters
  ^js [function-declaration]
  (.-parameters ^js function-declaration))

(defn type
  ^js [function-declaration]
  (.-type ^js function-declaration))

(defn flags
  ^js [function-declaration]
  (.-flags ^js function-declaration))

(defn parent
  ^js [function-declaration]
  (.-parent ^js function-declaration))

(defn source-file
  ^js [function-declaration]
  (.getSourceFile ^js function-declaration))

(defn child-count
  (^js [function-declaration]
   (.getChildCount ^js function-declaration))
  (^js [function-declaration source-file]
   (.getChildCount ^js function-declaration source-file)))

(defn child-at
  (^js [function-declaration index]
   (.getChildAt ^js function-declaration index))
  (^js [function-declaration index source-file]
   (.getChildAt ^js function-declaration index source-file)))

(defn children
  (^js [function-declaration]
   (.getChildren ^js function-declaration))
  (^js [function-declaration source-file]
   (.getChildren ^js function-declaration source-file)))

(defn start
  (^js [function-declaration]
   (.getStart ^js function-declaration))
  (^js [function-declaration source-file]
   (.getStart ^js function-declaration source-file))
  (^js [function-declaration source-file include-js-doc-comment?]
   (.getStart ^js function-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [function-declaration]
  (.getFullStart ^js function-declaration))

(defn get-end
  ^js [function-declaration]
  (.getEnd ^js function-declaration))

(defn width
  (^js [function-declaration]
   (.getWidth ^js function-declaration))
  (^js [function-declaration source-file]
   (.getWidth ^js function-declaration source-file)))

(defn full-width
  ^js [function-declaration]
  (.getFullWidth ^js function-declaration))

(defn leading-trivia-width
  (^js [function-declaration]
   (.getLeadingTriviaWidth ^js function-declaration))
  (^js [function-declaration source-file]
   (.getLeadingTriviaWidth ^js function-declaration source-file)))

(defn full-text
  (^js [function-declaration]
   (.getFullText ^js function-declaration))
  (^js [function-declaration source-file]
   (.getFullText ^js function-declaration source-file)))

(defn text
  (^js [function-declaration]
   (.getText ^js function-declaration))
  (^js [function-declaration source-file]
   (.getText ^js function-declaration source-file)))

(defn first-token
  (^js [function-declaration]
   (.getFirstToken ^js function-declaration))
  (^js [function-declaration source-file]
   (.getFirstToken ^js function-declaration source-file)))

(defn last-token
  (^js [function-declaration]
   (.getLastToken ^js function-declaration))
  (^js [function-declaration source-file]
   (.getLastToken ^js function-declaration source-file)))

(defn for-each-child
  (^js [function-declaration cb-node]
   (.forEachChild ^js function-declaration cb-node))
  (^js [function-declaration cb-node cb-node-array]
   (.forEachChild ^js function-declaration cb-node cb-node-array)))

(defn decorators
  ^js [function-declaration]
  (.-decorators ^js function-declaration))

(defn pos
  ^js [function-declaration]
  (.-pos ^js function-declaration))

(defn end
  ^js [function-declaration]
  (.-end ^js function-declaration))
