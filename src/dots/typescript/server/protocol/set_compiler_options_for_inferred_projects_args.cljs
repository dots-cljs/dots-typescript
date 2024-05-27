(ns dots.typescript.server.protocol.set-compiler-options-for-inferred-projects-args
  "Argument for SetCompilerOptionsForInferredProjectsRequest request.")

(defn options
  "Compiler options to be used with inferred projects.
   
   **Returns:** `InferredProjectCompilerOptions`"
  ^js [set-compiler-options-for-inferred-projects-args]
  (.-options ^js set-compiler-options-for-inferred-projects-args))

(defn set-options!
  "Compiler options to be used with inferred projects."
  ^js [set-compiler-options-for-inferred-projects-args value]
  (set! (.-options ^js set-compiler-options-for-inferred-projects-args) value))

(defn project-root-path
  "Specifies the project root path used to scope compiler options.
   It is an error to provide this property if the server has not been started with
   `useInferredProjectPerProjectRoot` enabled.
   
   **Returns:** `string | undefined`"
  ^js [set-compiler-options-for-inferred-projects-args]
  (.-projectRootPath ^js set-compiler-options-for-inferred-projects-args))

(defn set-project-root-path!
  "Specifies the project root path used to scope compiler options.
   It is an error to provide this property if the server has not been started with
   `useInferredProjectPerProjectRoot` enabled."
  ^js [set-compiler-options-for-inferred-projects-args value]
  (set! (.-projectRootPath ^js set-compiler-options-for-inferred-projects-args) value))
