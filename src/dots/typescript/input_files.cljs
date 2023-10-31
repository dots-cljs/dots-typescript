(ns dots.typescript.input-files)

(defn kind
  ^js [input-files]
  (.-kind ^js input-files))

(defn javascript-path
  ^js [input-files]
  (.-javascriptPath ^js input-files))

(defn set-javascript-path!
  ^js [input-files value]
  (set! (.-javascriptPath ^js input-files) value))

(defn javascript-text
  ^js [input-files]
  (.-javascriptText ^js input-files))

(defn set-javascript-text!
  ^js [input-files value]
  (set! (.-javascriptText ^js input-files) value))

(defn javascript-map-path
  ^js [input-files]
  (.-javascriptMapPath ^js input-files))

(defn set-javascript-map-path!
  ^js [input-files value]
  (set! (.-javascriptMapPath ^js input-files) value))

(defn javascript-map-text
  ^js [input-files]
  (.-javascriptMapText ^js input-files))

(defn set-javascript-map-text!
  ^js [input-files value]
  (set! (.-javascriptMapText ^js input-files) value))

(defn declaration-path
  ^js [input-files]
  (.-declarationPath ^js input-files))

(defn set-declaration-path!
  ^js [input-files value]
  (set! (.-declarationPath ^js input-files) value))

(defn declaration-text
  ^js [input-files]
  (.-declarationText ^js input-files))

(defn set-declaration-text!
  ^js [input-files value]
  (set! (.-declarationText ^js input-files) value))

(defn declaration-map-path
  ^js [input-files]
  (.-declarationMapPath ^js input-files))

(defn set-declaration-map-path!
  ^js [input-files value]
  (set! (.-declarationMapPath ^js input-files) value))

(defn declaration-map-text
  ^js [input-files]
  (.-declarationMapText ^js input-files))

(defn set-declaration-map-text!
  ^js [input-files value]
  (set! (.-declarationMapText ^js input-files) value))

(defn flags
  ^js [input-files]
  (.-flags ^js input-files))

(defn parent
  ^js [input-files]
  (.-parent ^js input-files))

(defn source-file
  ^js [input-files]
  (.getSourceFile ^js input-files))

(defn child-count
  (^js [input-files]
   (.getChildCount ^js input-files))
  (^js [input-files source-file]
   (.getChildCount ^js input-files source-file)))

(defn child-at
  (^js [input-files index]
   (.getChildAt ^js input-files index))
  (^js [input-files index source-file]
   (.getChildAt ^js input-files index source-file)))

(defn children
  (^js [input-files]
   (.getChildren ^js input-files))
  (^js [input-files source-file]
   (.getChildren ^js input-files source-file)))

(defn start
  (^js [input-files]
   (.getStart ^js input-files))
  (^js [input-files source-file]
   (.getStart ^js input-files source-file))
  (^js [input-files source-file include-js-doc-comment?]
   (.getStart ^js input-files source-file include-js-doc-comment?)))

(defn full-start
  ^js [input-files]
  (.getFullStart ^js input-files))

(defn get-end
  ^js [input-files]
  (.getEnd ^js input-files))

(defn width
  (^js [input-files]
   (.getWidth ^js input-files))
  (^js [input-files source-file]
   (.getWidth ^js input-files source-file)))

(defn full-width
  ^js [input-files]
  (.getFullWidth ^js input-files))

(defn leading-trivia-width
  (^js [input-files]
   (.getLeadingTriviaWidth ^js input-files))
  (^js [input-files source-file]
   (.getLeadingTriviaWidth ^js input-files source-file)))

(defn full-text
  (^js [input-files]
   (.getFullText ^js input-files))
  (^js [input-files source-file]
   (.getFullText ^js input-files source-file)))

(defn text
  (^js [input-files]
   (.getText ^js input-files))
  (^js [input-files source-file]
   (.getText ^js input-files source-file)))

(defn first-token
  (^js [input-files]
   (.getFirstToken ^js input-files))
  (^js [input-files source-file]
   (.getFirstToken ^js input-files source-file)))

(defn last-token
  (^js [input-files]
   (.getLastToken ^js input-files))
  (^js [input-files source-file]
   (.getLastToken ^js input-files source-file)))

(defn for-each-child
  (^js [input-files cb-node]
   (.forEachChild ^js input-files cb-node))
  (^js [input-files cb-node cb-node-array]
   (.forEachChild ^js input-files cb-node cb-node-array)))

(defn decorators
  ^js [input-files]
  (.-decorators ^js input-files))

(defn modifiers
  ^js [input-files]
  (.-modifiers ^js input-files))

(defn pos
  ^js [input-files]
  (.-pos ^js input-files))

(defn end
  ^js [input-files]
  (.-end ^js input-files))
