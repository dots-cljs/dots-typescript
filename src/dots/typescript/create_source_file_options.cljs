(ns dots.typescript.create-source-file-options)

(defn language-version
  ^js [create-source-file-options]
  (.-languageVersion ^js create-source-file-options))

(defn set-language-version!
  ^js [create-source-file-options value]
  (set! (.-languageVersion ^js create-source-file-options) value))

(defn implied-node-format
  "Controls the format the file is detected as - this can be derived from only the path
   and files on disk, but needs to be done with a module resolution cache in scope to be performant.
   This is usually `undefined` for compilations that do not have `moduleResolution` values of `node16` or `nodenext`."
  ^js [create-source-file-options]
  (.-impliedNodeFormat ^js create-source-file-options))

(defn set-implied-node-format!
  "Controls the format the file is detected as - this can be derived from only the path
   and files on disk, but needs to be done with a module resolution cache in scope to be performant.
   This is usually `undefined` for compilations that do not have `moduleResolution` values of `node16` or `nodenext`."
  ^js [create-source-file-options value]
  (set! (.-impliedNodeFormat ^js create-source-file-options) value))

(defn set-external-module-indicator
  "Controls how module-y-ness is set for the given file. Usually the result of calling
   `getSetExternalModuleIndicator` on a valid `CompilerOptions` object. If not present, the default
   check specified by `isFileProbablyExternalModule` will be used to set the field."
  ^js [create-source-file-options]
  (.-setExternalModuleIndicator ^js create-source-file-options))

(defn set-set-external-module-indicator!
  "Controls how module-y-ness is set for the given file. Usually the result of calling
   `getSetExternalModuleIndicator` on a valid `CompilerOptions` object. If not present, the default
   check specified by `isFileProbablyExternalModule` will be used to set the field."
  ^js [create-source-file-options value]
  (set! (.-setExternalModuleIndicator ^js create-source-file-options) value))
